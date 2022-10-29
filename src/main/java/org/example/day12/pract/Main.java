package org.example.day12.pract;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ////////////////// JAva 5///////////////////
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");

        String animal = (String) animals.get(1);
        System.out.println(animal);
        ////////////////// Genericts ///////////////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        System.out.println(animals2.get(0));

        ////////////////// Genericts ///////////////////

        List<String> animals3 = new ArrayList<>();

    }
}
