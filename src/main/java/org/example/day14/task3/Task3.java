package org.example.day14.task3;

import org.example.day14.task2.notExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws notExceptions {
        File file = new File("src/main/java/org/example/day14/task3/people.txt");
        System.out.printf(Arrays.toString(new List[]{parseFileToObjList(file)}));
    }

    public static List<Person> parseFileToObjList(File file) throws notExceptions {
        List<Person> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String name = line.split(" ")[0];
                String ageS = line.split(" ")[1];

                if (ageS.contains("-")){
                    throw new notExceptions();
                } else {
                    int age = Integer.parseInt(ageS);
                    Person person = new Person(name, age);
                    people.add(person);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        return people;
    }
}
