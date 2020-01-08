package com.caleb.armourplugin;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CalebAPI {
    public static boolean wearingDrumArmour(Player player) {
        int count = 0;
        ItemStack[] inventory = player.getInventory().getArmorContents();
        for (int i = 0; i<inventory.length; i++) {
            if (inventory[i].getItemMeta() != null) {
                if(inventory[i].getItemMeta().getDisplayName().contains("Drum Island")) {
                    count += 1;
                }
            }
        }
        return count ==4;
    }
}