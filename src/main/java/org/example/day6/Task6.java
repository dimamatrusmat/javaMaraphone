package org.example.day6;

public class Task6 {

    public static void main(String[] args) {
        Student student = new Student("�����");
        Teacher teacher = new Teacher("������ ��������", "����������");

        String ans = teacher.evaluate(student);

        System.out.println(ans);
    }

}
