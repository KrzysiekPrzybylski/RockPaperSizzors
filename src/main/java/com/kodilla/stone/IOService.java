package com.kodilla.stone;

import java.util.Scanner;

public class IOService {

    private static Scanner scanner = new Scanner(System.in);

    public static int getMove() {
        int move = scanner.nextInt();
        // sprawdzenie wartosci
        return move;
    }
    public static void showStartGameMessage() {
        System.out.println("Witamy w grze");
    }
    public static String getPlayerName() {
        System.out.println("Podaj swoje imię");
        String name = scanner.nextLine();
        return name;
    }
    public static int howMuchPoint() {
        System.out.println("Do ilu punktów gramy");
        int points = scanner.nextInt();
        return points;
    }
}
