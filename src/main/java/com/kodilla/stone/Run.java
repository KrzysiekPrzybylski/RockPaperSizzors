package com.kodilla.stone;

public class Run {
    public static void main(String[] args) {
        IOService.showStartGameMessage();
        String name = IOService.getPlayerName();
        Player humanPlayer = new HumanPlayer(name);
        Player computerPlayer = new ComputerPlayer();
        int howMuch = IOService.howMuchPoint();
        Rules rules = new Rules();
        GameProcesor gameProcesor = new GameProcesor(humanPlayer, computerPlayer, rules, howMuch);
        gameProcesor.startGame();



    }
}
