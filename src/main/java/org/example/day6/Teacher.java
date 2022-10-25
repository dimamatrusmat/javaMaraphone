package org.example.day6;

import java.util.Random;

public class Teacher {
    String name;
    String thing;

    public Teacher(String name, String thing) {
        this.name = name;
        this.thing = thing;
    }

    public String evaluate (Student student) {

        Random random = new Random();

        Evaluation evaluation = new Evaluation(random.nextInt(2,6));

        return "Преподаватель " +
                this.name +
                " оценил студента с именем " +
                student.getName() +
                " по предмету " +
                this.thing +
                " на оценку " +
                evaluation.getName() + ".";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThings() {
        return thing;
    }

    public void setThings(String thing) {
        this.thing = thing;
    }
}
