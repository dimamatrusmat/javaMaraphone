package org.example.finish;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

import static org.example.finish.Player.whoWin;

public class Game {

    public static void main(String[] args) throws Throwable {
        initGame();

    }

    public static void initGame() throws Throwable {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Морской бой");
        System.out.println("Напишите имя для первого игрока");
        Player player1 = new Player(scanner.next());
        System.out.println("Напишите имя для второго игрока");
        Player player2 = new Player(scanner.next());
        System.out.println("Отлично");

        Board board1 = new Board(player1);
        Board board2 = new Board(player2);

        System.out.println(player1.getName() + " установите коробли! Другой игрок не смотри");

        addShip(board1, scanner);

        System.out.println(player2.getName() + " установите коробли! Другой игрок не смотри");
        addShip(board2, scanner);

        board1.reverce(player2);
        board2.reverce(player1);

        Random random = new Random();
        int whoIsFirst = random.nextInt(2);

        System.out.println("Отлично все коробли поставлены!");

        while (true) {
            if (!whoWin(player1, player2, board1, board2)) {
                System.out.println("Спасибо за игру!");
                break;
            } else {
                System.out.println("Продолжаем)");

                if (whoIsFirst == 0) {
                    attacheGame(board1, scanner);
                    whoIsFirst = 1;
                } else {
                    attacheGame(board2, scanner);
                    whoIsFirst = 0;
                }
            }
        }

    }

    public static void attacheGame(Board board, Scanner scanner) {
        System.out.println("и ходит " + board.getPlayer().getName() );
        System.out.println("У него очков " + board.getPlayer().getScore());

        int [] cords = board.cheackStr(scanner.next());
        if (Arrays.equals(cords, new int[]{99, 99})) {
            System.out.println("Не верные координаты!!!!");
        } else {
            System.out.println(board.attach(cords));
        }
        board.print();
    }

    public static void addShip (Board board, Scanner scanner) {
        int size = 1;
        int count = 2;

        while (size != 0) {
            boolean counting = false;

            for (int i = 0; i < count;  i++ ) {
                try {
                    Ship ship = new Ship(scanner.next(), board, size);

                    if (ship.isCreating()) {
                        counting = true;
                    }
                } catch (Throwable e) {
                    counting = false;
                }

            }

            if (counting) {
                count++;
                size--;
            }

        }
    }
}
