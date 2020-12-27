package com.dragovorn.school.justin.entity.player;

import com.dragovorn.school.justin.entity.team.ITeam;
import org.bukkit.entity.Player;

public class CustomPlayer {

    private Player handle;

    private ITeam team;

    public CustomPlayer(Player handle) {
        this.handle = handle;

        // LOAD
    }

    public void save() {

    }

    public void setHandle(Player handle) {
        this.handle = handle;
    }

    public void setTeam(ITeam team) {
        this.team = team;
    }

    public Player getHandle() {
        return this.handle;
    }
}
