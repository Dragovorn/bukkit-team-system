package com.dragovorn.school.justin.entity.team;

import com.dragovorn.school.justin.entity.player.CustomPlayer;

import java.util.List;

public interface ITeam {

    ImposterTeam IMPOSTER = new ImposterTeam();
    CrewmateTeam CREWMATE = new CrewmateTeam();

    void onJoin();
    void incrementLives();
    void decrementLives();

    String getName();

    int getLives();

    List<CustomPlayer> getPlayers();
}
