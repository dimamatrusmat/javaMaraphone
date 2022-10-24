package org.example.day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;

        while (i < 5) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b != 0) {
                System.out.println(a + " / " + b + " = " + a / b);
                i++;
                continue;
            }

            System.out.println("Деление на 0");
        }
    }
}
