package com.dragovorn.school.justin.entity.team;

public class ImposterTeam extends AbstractTeam {

    public ImposterTeam() {
        super("Imposter", 5);
    }

    @Override
    public void onJoin() {
        // welcome to imposters
    }
}
