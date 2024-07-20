package it.vulpinefriend87.easyutils;

import net.minecraft.server.v1_12_R1.NBTBase;
import net.minecraft.server.v1_12_R1.NBTTagCompound;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_12_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class EasyItem {

    private ItemStack itemStack;

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

    public void setNBT(String key, Boolean value) {

        net.minecraft.server.v1_12_R1.ItemStack NMSItemStack = CraftItemStack.asNMSCopy(itemStack);
        NBTTagCompound tag = NMSItemStack.hasTag() ? NMSItemStack.getTag() : new NBTTagCompound();

        assert tag != null;
        tag.setBoolean(key, value);

        NMSItemStack.setTag(tag);

        itemStack = CraftItemStack.asBukkitCopy(NMSItemStack);

    }

    public void setNBT(String key, String value) {

        net.minecraft.server.v1_12_R1.ItemStack NMSItemStack = CraftItemStack.asNMSCopy(itemStack);
        NBTTagCompound tag = NMSItemStack.hasTag() ? NMSItemStack.getTag() : new NBTTagCompound();

        assert tag != null;
        tag.setString(key, value);

        NMSItemStack.setTag(tag);

        itemStack = CraftItemStack.asBukkitCopy(NMSItemStack);

    }

    public void setNBT(String key, Float value) {

        net.minecraft.server.v1_12_R1.ItemStack NMSItemStack = CraftItemStack.asNMSCopy(itemStack);
        NBTTagCompound tag = NMSItemStack.hasTag() ? NMSItemStack.getTag() : new NBTTagCompound();

        assert tag != null;
        tag.setFloat(key, value);

        NMSItemStack.setTag(tag);

        itemStack = CraftItemStack.asBukkitCopy(NMSItemStack);

    }

    public ItemStack getItemStack() { return itemStack; }

}
