/*    */ package eu.luscau.commands;
/*    */ 
/*    */ import eu.luscau.PickBreakBedRock;
/*    */ import eu.luscau.extras.ThePickaxe;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.PlayerInventory;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ 
/*    */ public class CommandPick implements org.bukkit.command.CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender s, org.bukkit.command.Command cmd, String l, String[] args)
/*    */   {
/* 17 */     if ((s instanceof org.bukkit.command.ConsoleCommandSender)) {
/* 18 */       if (args.length == 0) {
/* 19 */         s.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.USAGE").replace("&", "§"));
/* 20 */         return true;
/*    */       }
/*    */       
/* 23 */       Player on = Bukkit.getPlayer(args[0]);
/* 24 */       if (on == null) {
/* 25 */         s.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.PLAYER_NOT_FOUND")
/* 26 */           .replace("&", "§"));
/* 27 */         return true;
/*    */       }
/*    */       
/* 30 */       on.getInventory().addItem(new ItemStack[] { ThePickaxe.getPickaxe() });
/* 31 */       s.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.SUCCESS_GIVE").replace("&", "§")
/* 32 */         .replace("{player}", on.getName()));
/* 33 */       on.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.PLAYER_RECEIVED_PICKAXE")
/* 34 */         .replace("&", "§").replace("{player}", on.getName()));
/* 35 */       return true; }
/* 36 */     if ((s instanceof Player)) {
/* 37 */       Player p = (Player)s;
/* 38 */       if (p.hasPermission("pick.silk.give")) {
/* 39 */         if (args.length == 0) {
/* 40 */           p.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.PLAYER_RECEIVED_PICKAXE")
/* 41 */             .replace("&", "§"));
/* 42 */           p.getInventory().addItem(new ItemStack[] { ThePickaxe.getPickaxe() });
/* 43 */           return true;
/*    */         }
/*    */         
/* 46 */         if (args[0].equalsIgnoreCase("reload")) {
/* 47 */           PickBreakBedRock.getPlugin().reloadConfig();
/* 48 */           p.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.CONFIG_RELOADED").replace("&", "§"));
/* 49 */           return true;
/*    */         }
/*    */         
/* 52 */         Player on = Bukkit.getPlayer(args[0]);
/* 53 */         if (on == null) {
/* 54 */           s.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.PLAYER_NOT_FOUND")
/* 55 */             .replace("&", "§"));
/* 56 */           return true;
/*    */         }
/*    */         
/* 59 */         on.getInventory().addItem(new ItemStack[] { ThePickaxe.getPickaxe() });
/* 60 */         s.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.SUCCESS_GIVE")
/* 61 */           .replace("&", "§").replace("{player}", on.getName()));
/* 62 */         on.sendMessage(PickBreakBedRock.getPlugin().getConfig().getString("Messages.PLAYER_RECEIVED_PICKAXE")
/* 63 */           .replace("&", "§"));
/*    */       }
/*    */     }
/*    */     
/* 67 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Lucas\Desktop\testar pls\plugins\lcPickBreakBedRock.jar!\eu\luscau\commands\CommandPick.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */