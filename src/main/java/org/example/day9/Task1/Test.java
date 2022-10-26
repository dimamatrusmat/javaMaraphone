package org.example.day9.Task1;

public class Test {



    public static void main(String[] args) {
        Student student = new Student("Maxim", "IS");
        Human oleg = new Human("Oleg");
        Teacher gavril = new Teacher("Gavril", "Math");

        student.printInfo();
        oleg.printInfo();
        gavril.printInfo();

    }
}
