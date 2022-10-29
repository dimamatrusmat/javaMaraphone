package org.example.day11.Task2;

import org.example.day11.Task2.Warehouse;
import org.example.day11.Task2.Worker;

public class Picker implements Worker {
    private int salary;

    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void toWork() {
        salary += 100;
        warehouse.setCountOrder(warehouse.getCountOrder()+1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder() > 1500){
            salary *= 3;
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}
