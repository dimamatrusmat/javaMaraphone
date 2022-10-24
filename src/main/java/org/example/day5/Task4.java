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
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;

            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }

            if (sum > max) {
                max = sum;
                startIndex = i;
            }
        }
        System.out.println("max " + max);
        System.out.println("startIndex " + startIndex);
        System.out.println(Arrays.toString(array));
    }
}
