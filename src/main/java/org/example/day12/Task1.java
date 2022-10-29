package org.example.day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("reen");
        cars.add("DBF");
        cars.add("ford");
        cars.add("Lada");
        cars.add("Kari");

        for (String car: cars) {
            System.out.println(car);
        }
        cars.add(2, "Seil");
        cars.remove(0);
        System.out.println(32132131);
        for (String car: cars) {
            System.out.println(car);
        }
    }
}
