package it.vulpinefriend87.easyutils;

import org.bukkit.ChatColor;

public class Colorize {

    public static String color(String stringToColor) {

        return ChatColor.translateAlternateColorCodes('&', stringToColor);

    }

}
