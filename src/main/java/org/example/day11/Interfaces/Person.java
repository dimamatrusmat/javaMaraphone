package org.example.day11.Interfaces;

public class Person implements Info{
    public String name;

    public Person (String name) {
        this.name = name;
    }

    @Override
    public void showInfo(){
        System.out.println(name + " is good man");
    }

    public void sayHello () {
        System.out.println("Hello");
    }
}
