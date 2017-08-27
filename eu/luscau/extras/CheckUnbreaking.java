package eu.luscau.extras;

import org.bukkit.inventory.ItemStack;

public class CheckUnbreaking {

	public static void checkUnbreakingLevelSlow(int unb, ItemStack i) {
		if (unb == 0) {
			i.setDurability((short) (i.getDurability() + 7));
		}
		if (unb == 1) {
			i.setDurability((short) (i.getDurability() + 6));
		}
		if (unb == 2) {
			i.setDurability((short) (i.getDurability() + 5));
		}
		if (unb == 3) {
			i.setDurability((short) (i.getDurability() + 4));
		}
	}
	
	public static void checkUnbreakingLevelFast(int unb, ItemStack i) {
		if (unb == 0) {
			i.setDurability((short) (i.getDurability() + 15));
		}
		if (unb == 1) {
			i.setDurability((short) (i.getDurability() + 13));
		}
		if (unb == 2) {
			i.setDurability((short) (i.getDurability() + 12));
		}
		if (unb == 3) {
			i.setDurability((short) (i.getDurability() + 10));
		}
	}
	
	public static void checkUnbreakingLevelVeryFast(int unb, ItemStack i) {
		if (unb == 0) {
			i.setDurability((short) (i.getDurability() + 30));
		}
		if (unb == 1) {
			i.setDurability((short) (i.getDurability() + 27));
		}
		if (unb == 2) {
			i.setDurability((short) (i.getDurability() + 25));
		}
		if (unb == 3) {
			i.setDurability((short) (i.getDurability() + 20));
		}
	}

}
