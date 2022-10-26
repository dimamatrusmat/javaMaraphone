package org.example.day9.Task2;

public class Triangle extends Figure {

    private double st1;
    private double st2;
    private double st3;

    public Triangle (String color, double st1, double st2, double st3) {
        super(color);

        this.st1 = st1;
        this.st2 = st2;
        this.st3 = st3;
    }

    @Override
    public double area() {
        double p = perimeter()/2;

        return Math.sqrt(p * ((p-st1) * (p-st2) * (p-st3)));
    }

    @Override
    public double perimeter() {
        return st2 + st1 + st3;
    }

    public double getSt1() {
        return st1;
    }

    public void setSt1(int st1) {
        this.st1 = st1;
    }

    public double getSt2() {
        return st2;
    }

    public void setSt2(int st2) {
        this.st2 = st2;
    }

    public double getSt3() {
        return st3;
    }

    public void setSt3(int st3) {
        this.st3 = st3;
    }
}
