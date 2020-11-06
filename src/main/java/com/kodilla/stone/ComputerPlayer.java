package com.kodilla.stone;

import java.util.Random;

public class ComputerPlayer implements Player {
    private Random random = new Random();
    private int points = 0;
    @Override
    public int getMove() {
        return random.nextInt(3);
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
        return "Computer";
    }
}
