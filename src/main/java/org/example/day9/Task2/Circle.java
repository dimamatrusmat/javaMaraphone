package org.example.day9.Task2;

public class Circle extends Figure{

    int radius;

    public Circle (String color, int radius) {
        super(color);

        this.radius = radius;
    }

    @Override
    public double area () {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter () {
        return 2 * Math.PI * radius;
    }
}
