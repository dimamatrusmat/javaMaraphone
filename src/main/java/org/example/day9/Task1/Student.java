package org.example.day9.Task1;

public class Student extends Human {

    private String nameGroup;

    public Student(String name, String nameGroup) {
        super(name);

        this.nameGroup = nameGroup;
    }

    public void setNameGroup (String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public String getNameGroup () {return nameGroup;}

    @Override
    public void printInfo () {
        super.printInfo();
        System.out.printf("This student is %s\n", getName());
    }

}
