package org.example.day11.Task2;

import org.example.day11.Task2.Warehouse;

public class Task2 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        System.out.println(warehouse + " " + picker + " " + courier);

        picker.toWork();
        courier.toWork();

        System.out.println(warehouse + " " + picker + " " + courier);

        for (int i = 0; i < 1501; i++) {
            picker.toWork();
            courier.toWork();
        }
        System.out.println(warehouse + " " + picker + " " + courier);

        picker.bonus();
        courier.bonus();

        System.out.println(warehouse + " " + picker + " " + courier);

    }
}
