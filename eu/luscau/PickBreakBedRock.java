/*    */ package eu.luscau;
/*    */ 
/*    */ import eu.luscau.commands.CommandPick;
/*    */ import eu.luscau.listeners.BlockBreak;
/*    */ import org.bukkit.Server;
/*    */ import org.bukkit.command.ConsoleCommandSender;
/*    */ import org.bukkit.command.PluginCommand;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ import org.bukkit.plugin.PluginManager;
/*    */ 
/*    */ public class PickBreakBedRock extends org.bukkit.plugin.java.JavaPlugin implements Listener
/*    */ {
/* 14 */   private ConsoleCommandSender c = getServer().getConsoleSender();
/* 15 */   private PluginManager pm = getServer().getPluginManager();
/*    */   
/*    */   public void onEnable()
/*    */   {
/* 19 */     checkFactions();
/* 20 */     sendMessages();
/* 21 */     createConfig();
/* 22 */     registerCommandsAndEvents();
/*    */   }
/*    */   
/*    */   void sendMessages() {
/* 26 */     this.c.sendMessage(" ");
/* 27 */     this.c.sendMessage("§clcPickBreakBedRock - Habilitado com sucesso...");
/* 28 */     this.c.sendMessage("§6Criado por - Luscau (luc4s.by)");
/* 29 */     this.c.sendMessage("version: " + getDescription().getVersion());
/* 30 */     this.c.sendMessage("");
/*    */   }
/*    */   
/*    */   void createConfig() {
/* 34 */     saveDefaultConfig();
/* 35 */     saveConfig();
/*    */   }
/*    */   
/*    */   void checkFactions() {
/* 39 */     if ((this.pm.getPlugin("Factions") == null) || (this.pm.getPlugin("MassiveCore") == null)) {
/* 40 */       this.pm.disablePlugin(getPlugin());
/* 41 */       this.c.sendMessage("Factions ou MassiveCore não encontrado, plugin desabilitado...");
/* 42 */       return;
/*    */     }
/*    */   }
/*    */   
/*    */   void registerCommandsAndEvents() {
/* 47 */     this.pm.registerEvents(new BlockBreak(), this);
/* 48 */     getCommand("pick").setExecutor(new CommandPick());
/*    */   }
/*    */   
/*    */   public static Plugin getPlugin() {
/* 52 */     return getPlugin(PickBreakBedRock.class);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lucas\Desktop\testar pls\plugins\lcPickBreakBedRock.jar!\eu\luscau\PickBreakBedRock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */