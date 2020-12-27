package com.dragovorn.school.justin.handler;

import com.dragovorn.school.justin.entity.player.CustomPlayer;
import com.google.common.collect.Maps;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.HashMap;
import java.util.UUID;

public class PlayerHandler implements Listener {

    private static final HashMap<UUID, CustomPlayer> PLAYERS = Maps.newHashMap();

    public static CustomPlayer get(Player player) {
        return PLAYERS.get(player.getUniqueId());
    }

    private static void register(Player player) {
        CustomPlayer cPlayer = PLAYERS.get(player.getUniqueId());

        if (cPlayer == null) {
            PLAYERS.put(player.getUniqueId(), new CustomPlayer(player));
        } else if (!cPlayer.getHandle().equals(player)) {
            cPlayer.setHandle(player);
        }
    }

    private static void deregister(Player player) {
        CustomPlayer cPlayer = PLAYERS.remove(player.getUniqueId());

        if (cPlayer == null) {
            return;
        }

        cPlayer.save();
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onJoin(PlayerJoinEvent event) {
        register(event.getPlayer());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onQuit(PlayerQuitEvent event) {
        deregister(event.getPlayer());
    }
}
