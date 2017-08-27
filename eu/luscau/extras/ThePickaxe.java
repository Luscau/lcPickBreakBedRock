package eu.luscau.extras;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import eu.luscau.PickBreakBedRock;

public class ThePickaxe {

	private static String NAME = PickBreakBedRock.getPlugin().getConfig().getString("Pickaxe.NAME");
	private static List<String> LORE = (List<String>) PickBreakBedRock.getPlugin().getConfig()
			.getStringList("Pickaxe.LORE".replace("&", "§"));

	public static ItemStack getPickaxe() {
		ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);

		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ThePickaxe.NAME.replace("&", "§"));
		meta.addEnchant(Enchantment.SILK_TOUCH, 2, true);
		List<String> lore = new ArrayList<String>();

		for (String string : ThePickaxe.LORE) {
			lore.add(string.replace("&", "§"));
		}
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}

}
