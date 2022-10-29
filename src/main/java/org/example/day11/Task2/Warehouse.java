package org.example.day11.Task2;

public class Warehouse {
    private int balance;
    private int countOrder;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "balance=" + balance +
                ", countOrder=" + countOrder +
                '}';
    }
}
