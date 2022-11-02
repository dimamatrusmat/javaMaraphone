package org.example.day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(877127367));
    }

    public static int count7(int sevens) {
        String sevenv = String.valueOf(sevens);

        if (sevenv.length() == 1) {
            if (sevens == 7) {
                return 1;
            } else {
                return 0;
            }
        } else {

            int num = Integer.parseInt(sevenv.substring(0, 1));
            sevenv = sevenv.substring(1);
            if (num == 7) {
                return 1 + count7(Integer.parseInt(sevenv));
            } else {
                return count7(Integer.parseInt(sevenv));
            }

        }
    }
}
