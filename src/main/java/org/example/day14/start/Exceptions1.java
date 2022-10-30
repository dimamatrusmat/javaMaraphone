package org.example.day14.start;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args){
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }

    public static void readFile () throws FileNotFoundException {
        File file = new File("file.txt");
        Scanner scanner = new Scanner(file);

    }
}
