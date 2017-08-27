/*    */ package eu.luscau.extras;
/*    */ 
/*    */ import eu.luscau.PickBreakBedRock;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.enchantments.Enchantment;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ 
/*    */ public class ThePickaxe
/*    */ {
/* 15 */   private static String NAME = PickBreakBedRock.getPlugin().getConfig().getString("Pickaxe.NAME");
/* 16 */   private static List<String> LORE = PickBreakBedRock.getPlugin().getConfig()
/* 17 */     .getStringList("Pickaxe.LORE".replace("&", "§"));
/*    */   
/*    */   public static ItemStack getPickaxe() {
/* 20 */     ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
/*    */     
/* 22 */     ItemMeta meta = item.getItemMeta();
/* 23 */     meta.setDisplayName(NAME.replace("&", "§"));
/* 24 */     meta.addEnchant(Enchantment.SILK_TOUCH, 2, true);
/* 25 */     List<String> lore = new ArrayList();
/*    */     
/* 27 */     for (String string : LORE) {
/* 28 */       lore.add(string.replace("&", "§"));
/*    */     }
/* 30 */     meta.setLore(lore);
/* 31 */     item.setItemMeta(meta);
/* 32 */     return item;
/*    */   }
/*    */ }


/* Location:              C:\Users\Lucas\Desktop\testar pls\plugins\lcPickBreakBedRock.jar!\eu\luscau\extras\ThePickaxe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */