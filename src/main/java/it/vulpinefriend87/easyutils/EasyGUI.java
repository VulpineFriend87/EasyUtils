package it.vulpinefriend87.easyutils;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;
import java.util.Map;

public class EasyGUI {

    private final Inventory inventory;

    public EasyGUI(String title, int size, HashMap<EasyItem, Integer> items) {

        inventory = Bukkit.createInventory(null, size, title);

        for (Map.Entry<EasyItem, Integer> entry : items.entrySet()) {

            inventory.setItem(entry.getValue(), entry.getKey().getItemStack());

        }

    }

    public Inventory getInventory() { return inventory; }

}