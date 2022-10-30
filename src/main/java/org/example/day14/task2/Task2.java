package org.example.day14.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws notExceptions {
        File file = new File("src/main/java/org/example/day14/task2/people.txt");
        System.out.println(Arrays.toString(new List[]{parseFileToStringList(file)}));;
    }
    public static List<String> parseFileToStringList(File file) throws notExceptions {
        List<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String integer = line.split(" ")[1];
                if (integer.contains("-")) {
                    throw new notExceptions();
                } else {
                    list.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (notExceptions e) {
            throw new RuntimeException(e);
        }

        return list;
    }
}
