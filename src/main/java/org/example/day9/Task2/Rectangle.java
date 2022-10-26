package org.example.day9.Task2;

public class Rectangle extends Figure {

    private int width;
    private int height;

    public Rectangle (String color, int width, int height) {
        super(color);

        this.height = height;
        this.width = width;
    }

    @Override
    public double area () {
        return height * width;
    }

    @Override
    public double perimeter () {
        return height * 2 + width * 2;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
