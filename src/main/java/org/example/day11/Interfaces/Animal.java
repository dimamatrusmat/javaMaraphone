package org.example.day11.Interfaces;

public class Animal implements Info{

    public int id;

    public Animal (int id) {
        this.id = id;
    }

    @Override
    public void showInfo(){
        System.out.println("It is " + id + " animal");
    }

    public void sleep () {
        System.out.println("This animal is sleep");
    }

}
