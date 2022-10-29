package org.example.day12.pract;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> chhet = new ArrayList<Integer>();

        for (int i = 0; i < 500; i++) {
            if ((i >= 0 && i <= 30) || (i >= 300 && i <= 350)){
                if (i % 2 == 0) {
                    chhet.add(i);
                }
            }
        }

        for (Integer i: chhet) {
            System.out.println(i);
        }
    }
}
