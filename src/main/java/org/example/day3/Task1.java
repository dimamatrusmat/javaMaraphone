package org.example.day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String in = scanner.nextLine();

            if (in.equals("Stop")) {
                break;
            }
            String ans = "��� ������";
            switch (in) {
                case "������":
                case "�����������":
                case "������":
                    ans = "������";
                    break;
                case "���":
                case "�����":
                case "�����":
                    ans = "������";
                    break;
                case "���������":
                case "���������":
                case "������":
                    ans = "������";
                    break;
                case "������":
                case "������":
                case "ʸ���":
                    ans = "��������";
                    break;
            }
            System.out.println(ans);
        }
    }
}
