/*    */ package eu.luscau.extras;
/*    */ 
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class CheckUnbreaking
/*    */ {
/*    */   public static void checkUnbreakingLevelSlow(int unb, ItemStack i) {
/*  8 */     if (unb == 0) {
/*  9 */       i.setDurability((short)(i.getDurability() + 7));
/*    */     }
/* 11 */     if (unb == 1) {
/* 12 */       i.setDurability((short)(i.getDurability() + 6));
/*    */     }
/* 14 */     if (unb == 2) {
/* 15 */       i.setDurability((short)(i.getDurability() + 5));
/*    */     }
/* 17 */     if (unb == 3) {
/* 18 */       i.setDurability((short)(i.getDurability() + 4));
/*    */     }
/*    */   }
/*    */   
/*    */   public static void checkUnbreakingLevelFast(int unb, ItemStack i) {
/* 23 */     if (unb == 0) {
/* 24 */       i.setDurability((short)(i.getDurability() + 15));
/*    */     }
/* 26 */     if (unb == 1) {
/* 27 */       i.setDurability((short)(i.getDurability() + 13));
/*    */     }
/* 29 */     if (unb == 2) {
/* 30 */       i.setDurability((short)(i.getDurability() + 12));
/*    */     }
/* 32 */     if (unb == 3) {
/* 33 */       i.setDurability((short)(i.getDurability() + 10));
/*    */     }
/*    */   }
/*    */   
/*    */   public static void checkUnbreakingLevelVeryFast(int unb, ItemStack i) {
/* 38 */     if (unb == 0) {
/* 39 */       i.setDurability((short)(i.getDurability() + 30));
/*    */     }
/* 41 */     if (unb == 1) {
/* 42 */       i.setDurability((short)(i.getDurability() + 27));
/*    */     }
/* 44 */     if (unb == 2) {
/* 45 */       i.setDurability((short)(i.getDurability() + 25));
/*    */     }
/* 47 */     if (unb == 3) {
/* 48 */       i.setDurability((short)(i.getDurability() + 20));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Lucas\Desktop\testar pls\plugins\lcPickBreakBedRock.jar!\eu\luscau\extras\CheckUnbreaking.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */