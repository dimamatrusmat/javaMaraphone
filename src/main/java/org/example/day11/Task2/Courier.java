package org.example.day11.Task2;

import org.example.day11.Task2.Warehouse;

public class Courier implements Worker{
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void toWork() {
        warehouse.setBalance(warehouse.getBalance()+1);
        salary += 80;
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() > 1_000){
            salary *= 2;
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}
