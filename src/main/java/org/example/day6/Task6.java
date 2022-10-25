package org.example.day6;

public class Task6 {

    public static void main(String[] args) {
        Student student = new Student("Питор");
        Teacher teacher = new Teacher("Филлип Киркоров", "Математика");

        String ans = teacher.evaluate(student);

        System.out.println(ans);
    }

}
