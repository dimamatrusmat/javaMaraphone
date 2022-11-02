package org.example.finish;

import java.util.ArrayList;

public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        score = 0;
    }

    public void addScore() {
        score++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public static boolean whoWin(Player player1, Player player2, Board board1, Board board2) {

        if (player1.getScore() == board1.getShips().size()) {
            System.out.println("Победил " + player1.getName());

            return false;
        } else if (player2.getScore() == board2.getShips().size()) {
            System.out.println("Победил " + player2.getName());

            return false;
        }

        return true;
    }

}
