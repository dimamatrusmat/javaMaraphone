package org.example.day11.Task1;

import static org.example.day11.Task1.Warehouse.*;

public class Courier implements Worker{
    private long salary;
    private Warehouse warehouse;

    public Courier(int salary, Warehouse warehouse) {
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
        salary += 100000;
        setBalance(getBalance()+1000);

        if (getBalance() == 1000000) {
            bonus();
        }
    }

    @Override
    public void bonus() {
        salary *= 2;
    }
}
