package org.example.day16.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("src/main/java/org/example/day16/task2/file1.txt");
        generateFile1(file1);

        File file2 = new File("src/main/java/org/example/day16/task2/file2.txt");
        getArrive(file1, file2);

        printResult(file2);
    }

    public static void getArrive(File file1, File file2) throws FileNotFoundException {
        Scanner scanner = new Scanner(file1);

        PrintWriter pw = new PrintWriter(file2);
        String [] line = scanner.nextLine().split(" ");

        int maxCount = 50;

        double [] answ = new double[maxCount];
        int counter = 0;
        int countSum = 0;
        int countNum = 0;

        for (String i: line) {
            countSum += Integer.parseInt(i);
            counter++;

            if (counter == (maxCount-1)) {

                answ[countNum++] = (double) countSum / maxCount;
                countSum = 0;
                counter = 0;
            }
        }
        String toFile2 = Arrays.toString(answ).replace(",", "");
        pw.println(toFile2.substring(1,toFile2.length()-1));

        pw.close();
        scanner.close();
    }

    public static void generateFile1(File file) throws FileNotFoundException {
        Random random = new Random();
        PrintWriter pw0 = new PrintWriter(file);
        StringBuilder sg = new StringBuilder();

        int io = 0;
        while (io < 1000) {
            int i = random.nextInt(0, 101);
            if (io == 999) {
                sg.append(i);
            } else {
                sg.append(i + " ");
            }

            io++;
        }

        pw0.println(sg);
        pw0.close();
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String [] line = scanner.nextLine().split(" ");

        double ans = 0;

        for (String i: line) {
            double num = Double.parseDouble(i);
            ans += num;
        }
        scanner.close();

        System.out.println((int) ans);
    }
}
