package org.example.day7;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();
        Player player7 = new Player();
        Player player8 = new Player();

        while (true) {
            Scanner scanner = new Scanner(System.in);

            int shoes = scanner.nextInt();

            while (shoes > 0) {

                for (Player pl : Player.getAllPayesr()) {
                    pl.run();
                }

                shoes--;
            }

            System.out.println(Player.info());
        }

    }

}
