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

    public static boolean whoWin(Player player1, Player player2) {
        if (player1.getScore() == 20) {
            System.out.println("Победил " + player1);

            return false;
        } else if (player2.getScore() == 20) {
            System.out.println("Победил " + player2);

            return false;
        }

        return true;
    }

}
