package org.example.day14.start;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("src/main/java/org/example/day14/start/test.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String [] lineString = line.split(" ");

        System.out.println(Arrays.toString(lineString));
        int [] numbers = new int[3];

        int counter = 0;
        for (String s : lineString) {
            numbers[counter++] = Integer.parseInt(s);
        }
        System.out.println(Arrays.toString(numbers));
        
        
        scanner.close();
    }
}
