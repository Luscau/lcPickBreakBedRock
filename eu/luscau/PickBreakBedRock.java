package eu.luscau;

import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import eu.luscau.commands.CommandPick;
import eu.luscau.listeners.BlockBreak;

public class PickBreakBedRock extends JavaPlugin implements Listener {

	private ConsoleCommandSender c = getServer().getConsoleSender();
	private PluginManager pm = getServer().getPluginManager();

	@Override
	public void onEnable() {
		checkFactions();
		sendMessages();
		createConfig();
		registerCommandsAndEvents();
	}

	void sendMessages() {
		c.sendMessage(" ");
		c.sendMessage("§clcPickBreakBedRock - Habilitado com sucesso...");
		c.sendMessage("§6Criado por - Luscau (luc4s.by)");
		c.sendMessage("version: " + this.getDescription().getVersion());
		c.sendMessage("");
	}

	void createConfig() {
		saveDefaultConfig();
		saveConfig();
	}

	void checkFactions() {
		if (this.pm.getPlugin("Factions") == null || this.pm.getPlugin("MassiveCore") == null) {
			this.pm.disablePlugin(PickBreakBedRock.getPlugin());
			this.c.sendMessage("Factions ou MassiveCore não encontrado, plugin desabilitado...");
			return;
		}
	}

	void registerCommandsAndEvents() {
		pm.registerEvents(new BlockBreak(), this);
		this.getCommand("pick").setExecutor(new CommandPick());
	}

	public static Plugin getPlugin() {
		return getPlugin(PickBreakBedRock.class);
	}

}
