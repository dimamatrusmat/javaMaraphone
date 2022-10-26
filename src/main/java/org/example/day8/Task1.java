package org.example.day8;

import java.sql.Time;
import java.util.Random;
import java.util.Timer;


public class Task1 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        int i = 0;

//        StringBuilder s = new StringBuilder("");
        String s = "";

        while (i <= 20000) {
            s += (i + " ");
            i++;
        }

        long finishTime = System.currentTimeMillis();

        System.out.println(s);
        System.out.println(finishTime-startTime);

    }
}
