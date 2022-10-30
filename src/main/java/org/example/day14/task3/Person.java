package org.example.day14.task3;

public class Person {
    private String name;
    public int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{name='"+name+"', year" + age +"}";
    }
}
