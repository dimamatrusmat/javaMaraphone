package org.example.day15.practing;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WriteToFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/org/example/day15/practing/sho.csv");

        Scanner scanner = new Scanner(file);

        File fileOut = new File("src/main/java/org/example/day15/practing/shoes.txt");
        PrintWriter pw = new PrintWriter(fileOut);

        while (scanner.hasNextLine()) {
            String [] line = scanner.nextLine().split(";");
            if (Integer.parseInt(line[2]) == 0) {
                pw.println(Arrays.toString(line));
            }
        }
        pw.close();
        scanner.close();
    }
}
