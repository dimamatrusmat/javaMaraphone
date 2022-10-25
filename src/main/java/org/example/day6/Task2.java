package org.example.day6;

public class Task2 {

    public static void main(String[] args) {

       Airplane airplane = new Airplane("Russia", 2022, 20000, 400);

        airplane.fillUp(100);
        airplane.fillUp(3123);
        airplane.fillUp(1);

        airplane.setProducer("Englang");
        System.out.println(airplane.info());
    }
}
