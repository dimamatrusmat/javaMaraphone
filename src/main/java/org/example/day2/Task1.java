package org.example.day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ans = "Нет ответа";

        int floorCount = scanner.nextInt();

        if (floorCount <= 4) {
            ans = "Малоэтажный дом";
        } else if (floorCount >= 4 && floorCount <= 8 ) {
            ans = "Среднеэтажный дом";
        } else if (floorCount >= 9) {
            ans = "Многоэтажный дом";
        }

        System.out.println(ans);
    }
}
