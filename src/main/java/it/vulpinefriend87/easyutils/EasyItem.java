package it.vulpinefriend87.easyutils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class EasyItem {

    private final ItemStack itemStack;

    public EasyItem(Material material, String displayName, List<String> lore) {

        itemStack = new ItemStack(material);
        ItemMeta meta = itemStack.getItemMeta();

        displayName = Colorize.color(displayName);

        for (int i = 0; i < lore.size(); i++) {

            String line = lore.get(i);

            line = Colorize.color(line);

            lore.set(i, line);

        }

        if (meta != null) {

            meta.setDisplayName(displayName);
            meta.setLore(lore);
            itemStack.setItemMeta(meta);

        }

    }

    public ItemStack getItemStack() { return itemStack; }

}
