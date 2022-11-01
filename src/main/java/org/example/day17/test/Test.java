package org.example.day17.test;

public class Test {


    public static void main(String[] args) {
        Animal animal = Animal.ELEPHANT;

        switch (animal) {
            case CAT:
                System.out.println("This is Cat");
                break;
            case DOG:
                System.out.println("This is DOG");
                break;
            case FROG:
                System.out.println("This is FROG");
                break;
            default:
                System.out.println("This is not animal");
                break;
        }

        for (Animal animal1: Animal.values()) {
            System.out.println(animal1 + " - " + animal1.getTranslation());
        }

        for (Seasons seasons: Seasons.values()) {
            System.out.println(seasons.getTemperature());
        }

        System.out.println();
    }
}
