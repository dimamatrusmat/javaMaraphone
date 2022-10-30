package org.example.day14.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/java/org/example/day14/task1/fool.txt");
        printSumDigits(file);

    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String [] numS = line.split(" ");
            int ans = 0;

            if (numS.length == 10) {
                for (String s: numS) {
                    ans += Integer.parseInt(s);
                }
                System.out.println(ans);
            } else {
                System.out.println("Некорректный входной файл");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
