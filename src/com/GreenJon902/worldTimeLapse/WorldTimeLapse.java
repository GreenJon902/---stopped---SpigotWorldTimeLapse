package com.GreenJon902.worldTimeLapse;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class WorldTimeLapse extends JavaPlugin  {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[WorldTimeLapse]: Plugin is starting!");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[WorldTimeLapse]: Plugin has enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[WorldTimeLapse]: Plugin has finished!");
    }

}
