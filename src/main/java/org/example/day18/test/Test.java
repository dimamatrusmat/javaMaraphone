package org.example.day18.test;

public class Test {
    public static void main(String[] args) {
        System.out.println(fac(6));
    }

    private static int fac(int n) {

        if (n == 1) {
            return n;

        } else {
            n = n - 1;
            return n * fac(n);
        }

    }
}
