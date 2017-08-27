package eu.luscau.extras;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import eu.luscau.PickBreakBedRock;

public class CheckBreak {
	
	public static void checkBreakSlow(Player p) {
		if (p.getInventory().getItemInHand().getDurability() > 1554) {
			p.getInventory().setItemInHand(new ItemStack(Material.AIR));
			p.playSound(p.getLocation(), Sound.ITEM_BREAK, 2F, 1F);
			p.updateInventory();
			if (PickBreakBedRock.getPlugin().getConfig()
					.getBoolean("Configuration.MESSAGE_ON_BREAK") == true) {
				p.sendMessage(PickBreakBedRock.getPlugin().getConfig()
						.getString("Configuration.MESSAGE").replace("&", "§"));
			}
		}
	}
	
	public static void checkBreakFast(Player p) {
		if (p.getInventory().getItemInHand().getDurability() > 1545) {
			p.getInventory().setItemInHand(new ItemStack(Material.AIR));
			p.playSound(p.getLocation(), Sound.ITEM_BREAK, 2F, 1F);
			p.updateInventory();
			if (PickBreakBedRock.getPlugin().getConfig()
					.getBoolean("Configuration.MESSAGE_ON_BREAK") == true) {
				p.sendMessage(PickBreakBedRock.getPlugin().getConfig()
						.getString("Configuration.MESSAGE").replace("&", "§"));
			}
		}
	}
	
	public static void checkBreakVeryFast(Player p) {
		if (p.getInventory().getItemInHand().getDurability() > 1530) {
			p.getInventory().setItemInHand(new ItemStack(Material.AIR));
			p.playSound(p.getLocation(), Sound.ITEM_BREAK, 2F, 1F);
			p.updateInventory();
			if (PickBreakBedRock.getPlugin().getConfig()
					.getBoolean("Configuration.MESSAGE_ON_BREAK") == true) {
				p.sendMessage(PickBreakBedRock.getPlugin().getConfig()
						.getString("Configuration.MESSAGE").replace("&", "§"));
			}
		}
	}

}
