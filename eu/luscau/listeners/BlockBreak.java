package eu.luscau.listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.inventory.ItemStack;

import com.massivecraft.factions.entity.BoardColl;
import com.massivecraft.factions.entity.Faction;
import com.massivecraft.factions.entity.MPlayer;
import com.massivecraft.massivecore.ps.PS;

import eu.luscau.PickBreakBedRock;
import eu.luscau.extras.CheckBreak;
import eu.luscau.extras.CheckUnbreaking;

public class BlockBreak implements Listener {

	@EventHandler
	public void onBreak(BlockDamageEvent e) {
		Player p = e.getPlayer();
		if (e.getBlock().getType().equals(Material.BEDROCK)) {
			int silk = p.getItemInHand().getEnchantmentLevel(Enchantment.SILK_TOUCH);
			int unb = p.getInventory().getItemInHand().getEnchantmentLevel(Enchantment.DURABILITY);
			ItemStack i = e.getPlayer().getItemInHand();
			if (e.getBlock().getLocation().getY() > PickBreakBedRock.getPlugin().getConfig()
					.getInt("Configuration.LAYER")) {
				if (silk == 2) {
					MPlayer k = MPlayer.get(p);
					BoardColl coll = BoardColl.get();
					Faction faction = coll.getFactionAt(PS.valueOf(p.getLocation()));
					if (faction != null) {
						if (faction.getName() == k.getFaction().getName() || faction.getName() == "Wilderness") {
							if (PickBreakBedRock.getPlugin().getConfig()
									.getBoolean("Configuration.BED_ROCK_INVENTORY") == true) {
								e.getBlock().setType(Material.AIR);
								p.getInventory().addItem(new ItemStack(Material.BEDROCK, 1));
								if (PickBreakBedRock.getPlugin().getConfig()
										.getString("Configuration.VELOCITY_BREAK_PICK").equalsIgnoreCase("slow")) {
									CheckUnbreaking.checkUnbreakingLevelSlow(unb, i);
									CheckBreak.checkBreakSlow(p);
								} else if (PickBreakBedRock.getPlugin().getConfig()
										.getString("Configuration.VELOCITY_BREAK_PICK").equalsIgnoreCase("fast")) {
									CheckUnbreaking.checkUnbreakingLevelFast(unb, i);
									CheckBreak.checkBreakFast(p);
								} else if (PickBreakBedRock.getPlugin().getConfig()
										.getString("Configuration.VELOCITY_BREAK_PICK").equalsIgnoreCase("veryfast")) {
									CheckUnbreaking.checkUnbreakingLevelVeryFast(unb, i);
									CheckBreak.checkBreakVeryFast(p);
								}
							} else {
								if (PickBreakBedRock.getPlugin().getConfig()
										.getString("Configuration.VELOCITY_BREAK_PICK").equalsIgnoreCase("slow")) {
									CheckUnbreaking.checkUnbreakingLevelSlow(unb, i);
									CheckBreak.checkBreakSlow(p);
									e.setInstaBreak(true);
								} else if (PickBreakBedRock.getPlugin().getConfig()
										.getString("Configuration.VELOCITY_BREAK_PICK").equalsIgnoreCase("fast")) {
									CheckUnbreaking.checkUnbreakingLevelFast(unb, i);
									CheckBreak.checkBreakFast(p);
									e.setInstaBreak(true);
								} else if (PickBreakBedRock.getPlugin().getConfig()
										.getString("Configuration.VELOCITY_BREAK_PICK").equalsIgnoreCase("veryfast")) {
									CheckUnbreaking.checkUnbreakingLevelVeryFast(unb, i);
									CheckBreak.checkBreakVeryFast(p);
									e.setInstaBreak(true);
								}
							}
						}
					}
				}
			}
		}
	}

}
