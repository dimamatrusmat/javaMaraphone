package org.example.day5;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countElement = scanner.nextInt();


        Random random = new Random();
        random.nextInt(10);

        int [] arrayCount = new int[countElement];

        int bigEight = 0;
        int one = 0;
        int chet = 0;
        int noChet = 0;
        int count = 0;


        for (int i = 0; i < countElement; i++) {
            arrayCount[i] = random.nextInt(10);

            count += arrayCount[i];

            if (arrayCount[i] % 2 != 0) {
                noChet++;
            } else if  (arrayCount[i] % 2 == 0) {
                chet++;
            }

            if (arrayCount[i] > 8) {
                bigEight++;
            }

            if (arrayCount[i] == 1) {
                one++;
            }

        }

        System.out.println("Lenght " + count);
        System.out.println("bigEight " + bigEight);
        System.out.println("one " + one);
        System.out.println("noChet " + noChet);
        System.out.println("chet " + chet);
    }
}
