package org.example.day6;

public class Motorbike {

    private int year;
    private String color;
    private String model;

    public String info() {return "Это байк";}

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int yearDifference(int newYear) {return this.year - newYear;}

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
