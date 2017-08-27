/*    */ package eu.luscau.listeners;
/*    */ 
/*    */ import com.massivecraft.factions.entity.BoardColl;
/*    */ import com.massivecraft.factions.entity.Faction;
/*    */ import com.massivecraft.factions.entity.MPlayer;
/*    */ import eu.luscau.PickBreakBedRock;
/*    */ import eu.luscau.extras.CheckBreak;
/*    */ import eu.luscau.extras.CheckUnbreaking;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.enchantments.Enchantment;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.block.BlockDamageEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.PlayerInventory;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ 
/*    */ public class BlockBreak implements org.bukkit.event.Listener
/*    */ {
/*    */   @org.bukkit.event.EventHandler
/*    */   public void onBreak(BlockDamageEvent e)
/*    */   {
/* 24 */     Player p = e.getPlayer();
/* 25 */     if (e.getBlock().getType().equals(Material.BEDROCK)) {
/* 26 */       int silk = p.getItemInHand().getEnchantmentLevel(Enchantment.SILK_TOUCH);
/* 27 */       int unb = p.getInventory().getItemInHand().getEnchantmentLevel(Enchantment.DURABILITY);
/* 28 */       ItemStack i = e.getPlayer().getItemInHand();
/*    */       
/* 30 */       if ((e.getBlock().getLocation().getY() > PickBreakBedRock.getPlugin().getConfig().getInt("Configuration.LAYER")) && 
/* 31 */         (silk == 2)) {
/* 32 */         MPlayer k = MPlayer.get(p);
/* 33 */         BoardColl coll = BoardColl.get();
/* 34 */         Faction faction = coll.getFactionAt(com.massivecraft.massivecore.ps.PS.valueOf(p.getLocation()));
/*    */         
/* 36 */         if ((faction != null) && (
/* 37 */           (faction.getName() == k.getFaction().getName()) || (faction.getName() == "Wilderness")))
/*    */         {
/*    */ 
/* 40 */           if (PickBreakBedRock.getPlugin().getConfig().getBoolean("Configuration.BED_ROCK_INVENTORY")) {
/* 41 */             e.getBlock().setType(Material.AIR);
/* 42 */             p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.BEDROCK, 1) });
/*    */             
/* 44 */             if (PickBreakBedRock.getPlugin().getConfig().getString("Configuration.VELOCITY_BREAK_PICK").equalsIgnoreCase("slow")) {
/* 45 */               CheckUnbreaking.checkUnbreakingLevelSlow(unb, i);
/* 46 */               CheckBreak.checkBreakSlow(p);
/*    */             }
/* 48 */             else if (PickBreakBedRock.getPlugin().getConfig().getString("Configuration.VELOCITY_BREAK_PICK").equalsIgnoreCase("fast")) {
/* 49 */               CheckUnbreaking.checkUnbreakingLevelFast(unb, i);
/* 50 */               CheckBreak.checkBreakFast(p);
/*    */             }
/* 52 */             else if (PickBreakBedRock.getPlugin().getConfig().getString("Configuration.VELOCITY_BREAK_PICK").equalsIgnoreCase("veryfast")) {
/* 53 */               CheckUnbreaking.checkUnbreakingLevelVeryFast(unb, i);
/* 54 */               CheckBreak.checkBreakVeryFast(p);
/*    */             }
/*    */             
/*    */           }
/* 58 */           else if (PickBreakBedRock.getPlugin().getConfig().getString("Configuration.VELOCITY_BREAK_PICK").equalsIgnoreCase("slow")) {
/* 59 */             CheckUnbreaking.checkUnbreakingLevelSlow(unb, i);
/* 60 */             CheckBreak.checkBreakSlow(p);
/* 61 */             e.setInstaBreak(true);
/*    */           }
/* 63 */           else if (PickBreakBedRock.getPlugin().getConfig().getString("Configuration.VELOCITY_BREAK_PICK").equalsIgnoreCase("fast")) {
/* 64 */             CheckUnbreaking.checkUnbreakingLevelFast(unb, i);
/* 65 */             CheckBreak.checkBreakFast(p);
/* 66 */             e.setInstaBreak(true);
/*    */           }
/* 68 */           else if (PickBreakBedRock.getPlugin().getConfig().getString("Configuration.VELOCITY_BREAK_PICK").equalsIgnoreCase("veryfast")) {
/* 69 */             CheckUnbreaking.checkUnbreakingLevelVeryFast(unb, i);
/* 70 */             CheckBreak.checkBreakVeryFast(p);
/* 71 */             e.setInstaBreak(true);
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Lucas\Desktop\testar pls\plugins\lcPickBreakBedRock.jar!\eu\luscau\listeners\BlockBreak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */