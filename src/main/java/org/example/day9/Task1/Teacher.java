package org.example.day9.Task1;

public class Teacher extends Human {

    private String teacherThing;

    public Teacher (String name, String teacherThing) {
        super(name);
        this.teacherThing = teacherThing;
    }

    public void setTeacherThing (String teacherThing) {
        this.teacherThing = teacherThing;
    }

    public String getTeacherThing () {return teacherThing;}

    @Override
    public void printInfo () {
        super.printInfo();

        System.out.printf("This teacher with name is %s\n", getName());
    }
}
