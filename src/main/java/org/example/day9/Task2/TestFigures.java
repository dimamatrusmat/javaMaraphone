package org.example.day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure [] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 23, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Green", 23),
        };

        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));

    }

    public static double calculateRedPerimeter(Figure [] figures) {
        double sum = 0;

        for (Figure fg: figures) {
            if (fg.getColor().equals("Red")) {
                sum += fg.perimeter();
            }
        }

        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;

        for (Figure fg: figures) {
            if (fg.getColor().equals("Red")){
                sum += fg.area();
            }
        }

        return sum;
    }
}
