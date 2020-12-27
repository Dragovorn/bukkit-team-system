package com.dragovorn.school.justin.entity.team;

public abstract class AbstractTeam implements ITeam {

    private final String name;

    private int lives;

    public AbstractTeam(String name, int lives) {
        this.name = name;
        this.lives = lives;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void decrementLives() { }

    @Override
    public void incrementLives() { }

    @Override
    public int getLives() {
        return this.lives;
    }
}
