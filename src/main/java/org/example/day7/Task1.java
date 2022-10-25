package org.example.day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane one = new Airplane("BMW", 2000, 3000, 700);

        Airplane two = new Airplane("Zil", 2000, 23131, 700);

        System.out.println(Airplane.getLengthingAir(two, one));
    }
}
