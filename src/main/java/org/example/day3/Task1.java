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
            String ans = "Нет такого";
            switch (in) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    ans = "Россия";
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    ans = "Италия";
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    ans = "Англия";
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    ans = "Германия";
                    break;
            }
            System.out.println(ans);
        }
    }
}
