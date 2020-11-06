package com.kodilla.stone;

public class GameProcesor {

    private Player player1;
    private Player player2;

    private Rules rules;
    private int howMuchPoints;

    public GameProcesor(Player player1, Player player2, Rules rules, int howMuchPoints) {
        this.player1 = player1;
        this.player2 = player2;
        this.rules = rules;
        this.howMuchPoints = howMuchPoints;
    }
    public void startGame() {

    }
}
