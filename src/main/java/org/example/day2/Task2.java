package org.example.day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (a < b) {
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}
