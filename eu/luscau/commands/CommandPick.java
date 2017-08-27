package eu.luscau.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import eu.luscau.PickBreakBedRock;
import eu.luscau.extras.ThePickaxe;

public class CommandPick implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String l, String[] args) {
		if (s instanceof ConsoleCommandSender) {
			if (args.length == 0) {
				s.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.USAGE").replace("&", "§"));
				return true;
			}

			Player on = Bukkit.getPlayer(args[0]);
			if (on == null) {
				s.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.PLAYER_NOT_FOUND")
						.replace("&", "§"));
				return true;
			}

			on.getInventory().addItem(ThePickaxe.getPickaxe());
			s.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.SUCCESS_GIVE").replace("&", "§")
					.replace("{player}", on.getName()));
			on.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.PLAYER_RECEIVED_PICKAXE")
					.replace("&", "§").replace("{player}", on.getName()));
			return true;
			
		} else if (s instanceof Player) {
			org.bukkit.entity.Player p = (Player) s;
			if (p.hasPermission("pick.silk.give")) {
				if (args.length == 0) {
					p.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.PLAYER_RECEIVED_PICKAXE")
							.replace("&", "§"));
					p.getInventory().addItem(ThePickaxe.getPickaxe());
					return true;
				}
				
				if(args[0].equalsIgnoreCase("reload")) {
					PickBreakBedRock.getPlugin().reloadConfig();
					p.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.CONFIG_RELOADED").replace("&", "§"));
					return true;
				}

				Player on = Bukkit.getPlayer(args[0]);
				if (on == null) {
					s.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.PLAYER_NOT_FOUND")
							.replace("&", "§"));
					return true;
				}

				on.getInventory().addItem(ThePickaxe.getPickaxe());
				s.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.SUCCESS_GIVE")
						.replace("&", "§").replace("{player}", on.getName()));
				on.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.PLAYER_RECEIVED_PICKAXE")
						.replace("&", "§"));
			}
		}
		return false;
	}

}
