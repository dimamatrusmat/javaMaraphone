package org.example.day6;

public class Car {

    private int year;
    private String model;
    private String color;

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String info() {return "��� ������";}

    public int yearDifference(int newYear) {return this.year - newYear;}
}
