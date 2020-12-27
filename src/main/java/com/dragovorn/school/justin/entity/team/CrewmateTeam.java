package com.dragovorn.school.justin.entity.team;

public class CrewmateTeam  extends AbstractTeam {

    public CrewmateTeam() {
        super("Crewmate", 10);
    }

    @Override
    public void onJoin() {
        // welcome to crewmates, kill dragon!!!
    }
}
