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

        if (meta != null) {

            meta.setDisplayName(displayName);
            meta.setLore(lore);
            itemStack.setItemMeta(meta);

        }

    }

    public ItemStack getItemStack() { return itemStack; }

}
