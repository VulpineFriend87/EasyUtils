package it.vulpinefriend87.easyutils;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EasyGUI {

    private final Inventory inventory;
    private final HashMap<EasyItem, Integer> items = new HashMap<>();

    public EasyGUI(String title, int size) {

        inventory = Bukkit.createInventory(null, size, Colorize.color(title));

        for (Map.Entry<EasyItem, Integer> entry : items.entrySet()) {

            inventory.setItem(entry.getValue(), entry.getKey().getItemStack());

        }

    }

    public void addItem(EasyItem item, int slot) {
        items.put(item, slot);
    }

    public void removeItem(EasyItem item) {
        items.remove(item);
    }

    public void removeItem(int slot) {
        Iterator<Map.Entry<EasyItem, Integer>> iterator = items.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<EasyItem, Integer> entry = iterator.next();
            if (entry.getValue().equals(slot)) {
                iterator.remove();
                break;
            }
        }
    }

    public HashMap<EasyItem, Integer> getItems() { return items; }

    public Inventory getInventory() { return inventory; }

}