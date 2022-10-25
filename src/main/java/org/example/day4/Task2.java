package org.example.day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int [] array = new int [100];
        int i = 0;
        while (i < 100) {
            array[i] = random.nextInt(10000);
            i++;
        }

        int smailest = 10000;
        int biggest = 0;
        int countZero = 0;
        int countZeroSum = 0;

         for ( int element: array) {

             if (element > biggest) {
                 biggest = element;
             }

             if (element < smailest) {
                 smailest = element;
             }

             if (element % 10 == 0 || element == 0) {
                 countZero += 1;
                 countZeroSum += element;
             }

         }

        System.out.println("biggest " + biggest);
        System.out.println("smailest " + smailest);
        System.out.println("countZero " + countZero);
        System.out.println("countZeroSum " + countZeroSum);
    }
}
