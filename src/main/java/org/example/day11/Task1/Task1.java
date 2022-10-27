package org.example.day11.Task1;

import java.util.ArrayList;

import static org.example.day11.Task1.Warehouse.getWorkers;

public class Task1 {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Courier courier1 = new Courier(0, warehouse);
        Picker picker1 = new Picker(0, warehouse);
        Courier courier2 = new Courier(0, warehouse);
        Picker picker2 = new Picker(0, warehouse);

        Warehouse warehouse1 = new Warehouse();

        Courier courier11 = new Courier(0, warehouse1);
        Picker picker11 = new Picker(0, warehouse1);

        ArrayList<Worker> workers = getWorkers();

        int i = 0;
        while (i <= 1000) {
            for (Worker worker: workers) {
                worker.doWork();

            }
            i++;
        }

        System.out.println(warehouse.toString());
        System.out.println(warehouse1.toString());

        System.out.println(courier1.getSalary());
        System.out.println(picker1.getSalary());

        System.out.println(courier11.getSalary());
        System.out.println(picker11.getSalary());
    }
}
