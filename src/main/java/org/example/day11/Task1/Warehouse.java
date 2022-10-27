package org.example.day11.Task1;

import java.util.ArrayList;

public class Warehouse {

    private static long countOrder;
    private static long balance;

    private static ArrayList<Worker> workers = new ArrayList<>();

    public static void addWorker(Worker worker) {
        workers.add(worker);
    }

    public static ArrayList<Worker> getWorkers () {
        return workers;
    }

    public static long getCountOrder() {
        return countOrder;
    }

    public static void upOrder () {
        countOrder += 1;
    }

    public static void setCountOrder(long countOrder) {
        Warehouse.countOrder = countOrder;
    }

    public static long getBalance() {
        return balance;
    }

    public static void setBalance(long balance) {
        Warehouse.balance = balance;
    }

    @Override
    public String toString () {
        return "В этом скале собранно заказов " + countOrder + ". Доход от них " + balance;
    }
}
