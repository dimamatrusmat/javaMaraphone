package org.example.day16.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/org/example/day16/task1/txt.txt");
        printResult(file);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String [] line = scanner.nextLine().split(" ");
        int count = line.length;
        long ans = 0;
        for (String num: line) {
            int i = Integer.parseInt(num);
            ans += i;
        }
        System.out.println(ans);
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println(count);
        double answer = (double) ans/count;
        System.out.println(answer+ " - " +  df.format(answer));
    }
}
