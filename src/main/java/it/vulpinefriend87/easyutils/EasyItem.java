package it.vulpinefriend87.easyutils;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

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

    public void setNBT(String key, boolean value) {
        ItemMeta meta = itemStack.getItemMeta();
        if (meta != null) {
            PersistentDataContainer container = meta.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey("EasyUtils", key);
            container.set(namespacedKey, PersistentDataType.BOOLEAN, value);
            itemStack.setItemMeta(meta);
        }
    }

    public void setNBT(String key, String value) {
        ItemMeta meta = itemStack.getItemMeta();
        if (meta != null) {
            PersistentDataContainer container = meta.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey("EasyUtils", key);
            container.set(namespacedKey, PersistentDataType.STRING, value);
            itemStack.setItemMeta(meta);
        }
    }

    public void setNBT(String key, float value) {
        ItemMeta meta = itemStack.getItemMeta();
        if (meta != null) {
            PersistentDataContainer container = meta.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey("EasyUtils", key);
            container.set(namespacedKey, PersistentDataType.FLOAT, value);
            itemStack.setItemMeta(meta);
        }
    }

    public ItemStack getItemStack() { return itemStack; }

}
