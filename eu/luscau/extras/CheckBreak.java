/*    */ package eu.luscau.extras;
/*    */ 
/*    */ import eu.luscau.PickBreakBedRock;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ 
/*    */ public class CheckBreak
/*    */ {
/*    */   public static void checkBreakSlow(Player p)
/*    */   {
/* 13 */     if (p.getInventory().getItemInHand().getDurability() > 1554) {
/* 14 */       p.getInventory().setItemInHand(new ItemStack(org.bukkit.Material.AIR));
/* 15 */       p.playSound(p.getLocation(), org.bukkit.Sound.ITEM_BREAK, 2.0F, 1.0F);
/* 16 */       p.updateInventory();
/*    */       
/* 18 */       if (PickBreakBedRock.getPlugin().getConfig().getBoolean("Configuration.MESSAGE_ON_BREAK")) {
/* 19 */         p.sendMessage(PickBreakBedRock.getPlugin().getConfig()
/* 20 */           .getString("Configuration.MESSAGE").replace("&", "§"));
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public static void checkBreakFast(Player p) {
/* 26 */     if (p.getInventory().getItemInHand().getDurability() > 1545) {
/* 27 */       p.getInventory().setItemInHand(new ItemStack(org.bukkit.Material.AIR));
/* 28 */       p.playSound(p.getLocation(), org.bukkit.Sound.ITEM_BREAK, 2.0F, 1.0F);
/* 29 */       p.updateInventory();
/*    */       
/* 31 */       if (PickBreakBedRock.getPlugin().getConfig().getBoolean("Configuration.MESSAGE_ON_BREAK")) {
/* 32 */         p.sendMessage(PickBreakBedRock.getPlugin().getConfig()
/* 33 */           .getString("Configuration.MESSAGE").replace("&", "§"));
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public static void checkBreakVeryFast(Player p) {
/* 39 */     if (p.getInventory().getItemInHand().getDurability() > 1530) {
/* 40 */       p.getInventory().setItemInHand(new ItemStack(org.bukkit.Material.AIR));
/* 41 */       p.playSound(p.getLocation(), org.bukkit.Sound.ITEM_BREAK, 2.0F, 1.0F);
/* 42 */       p.updateInventory();
/*    */       
/* 44 */       if (PickBreakBedRock.getPlugin().getConfig().getBoolean("Configuration.MESSAGE_ON_BREAK")) {
/* 45 */         p.sendMessage(PickBreakBedRock.getPlugin().getConfig()
/* 46 */           .getString("Configuration.MESSAGE").replace("&", "§"));
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Lucas\Desktop\testar pls\plugins\lcPickBreakBedRock.jar!\eu\luscau\extras\CheckBreak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */