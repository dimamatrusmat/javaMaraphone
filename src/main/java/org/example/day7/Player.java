package org.example.day7;

import java.util.ArrayList;
import java.util.Random;

public class Player {

    private int stamina;

    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;

    private static int countPlayers = 0;
    private static int countAllPlayers = 0;

    private static ArrayList<Player> allPlayers = new ArrayList<Player>();

    public Player () {
        allPlayers.add(this);

        Random random = new Random();
        this.stamina = random.nextInt(90, MAX_STAMINA + 1);

        if (countPlayers < 6) {
            countPlayers++;
        }

        countAllPlayers++;
    }

    public int getStamina(){return this.stamina;}

    public void run() {
        this.stamina -= 1;

        if (this.stamina == MIN_STAMINA) {
            this.exet();

            countAllPlayers--;
            countPlayers--;
        }
    }

    public void exet() {
        try {
            this.finalize();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Player> getAllPayesr () {
        return allPlayers;
    }

    public static String info() {

        String ans = "";

        if (countAllPlayers == 6) {
            ans += "Full comand";
        } else if (countAllPlayers > 6) {
            ans += "Full comand, but запасом " + (countAllPlayers - 6) +" playes";
        } else {
            ans += "Command is the smalest, нужно еще " + (6 - countAllPlayers)  + " players";
        }

        return ans;
    }

}
