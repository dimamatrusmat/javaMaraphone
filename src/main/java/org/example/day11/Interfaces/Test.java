package org.example.day11.Interfaces;

public class Test {
    public static void main(String[] args) {
//        Animal animal = new Animal(1);
//        Person person = new Person("Geerge");
//
//        animal.showInfo();
//        person.showInfo();

        Info info1 = new Animal(1);
        Info info2 = new Person("Fedor");
        outputInfo(info1);
        info2.showInfo();
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
