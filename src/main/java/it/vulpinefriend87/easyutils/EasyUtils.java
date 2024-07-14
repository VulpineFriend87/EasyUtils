package it.vulpinefriend87.easyutils;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class EasyUtils extends JavaPlugin {

    @Override
    public void onEnable() {

        getLogger().info(ChatColor.GREEN.toString() + ChatColor.BOLD + "§fThis server is running §9EasyUtils &fby VulpineFriend87!");

    }

}