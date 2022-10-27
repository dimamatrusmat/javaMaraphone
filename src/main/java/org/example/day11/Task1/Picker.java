package org.example.day11.Task1;

import org.example.day11.Task1.Warehouse;

import static org.example.day11.Task1.Warehouse.*;


public class Picker implements Worker {
    private long salary;

    private Warehouse warehouse;

    public Picker(int salary, Warehouse warehouse) {
        this.salary = salary;
        this.warehouse = warehouse;
        addWorker(this);
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80000;
        setCountOrder(getCountOrder()+1);

        if (getCountOrder() == 1500) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        salary *= 3;
    }
}
