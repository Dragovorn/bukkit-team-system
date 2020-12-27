package com.dragovorn.school.justin;

import com.dragovorn.school.justin.handler.PlayerHandler;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class HandlersMain extends JavaPlugin {

    private static HandlersMain instance;

    public static HandlersMain getInstance() {
        return instance;
    }

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        register(new PlayerHandler());
    }

    private void register(Listener listener) {
        Bukkit.getPluginManager().registerEvents(listener, this);
    }
}
