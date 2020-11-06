package com.kodilla.stone;

public class HumanPlayer implements Player {

    private String name;

    private int points = 0;

    public HumanPlayer(String name) {
        this.name = name;
    }

    @Override
    public int getMove() {
        return IOService.getMove();
    }

    @Override
    public void addPoint() {
        points++;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public String getName() {
        return name;
    }
}
