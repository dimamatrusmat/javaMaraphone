package org.example.day5;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int [] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int max = 0;
        int startIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int maxer = 0;
            int start = 0;

            if (i == 0) {
                maxer = array[i] + array[i+1] + array[i+2];
            } else if (i == 99) {
                maxer = array[i] + array[i-1] + array[i-2];
                start = i-2;
            } else {
                maxer = array[i] + array[i-1] + array[i+1];
                start = i-1;
            }

            if (maxer > max) {
                max = maxer;
                startIndex = start;
            }
        }
        System.out.println("max " + max);
        System.out.println("startIndex " + startIndex);
        System.out.println(Arrays.toString(array));
    }
}
