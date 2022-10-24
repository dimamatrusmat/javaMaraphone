package org.example.day5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] dobleArray = new int[12][8];

        for (int m = 0; m < dobleArray.length; m++) {

            for (int n = 0; n < dobleArray[m].length; n++) {
                dobleArray[m][n] = random.nextInt(50);
            }

        }

        int i = 0;

        int smallIndex = 0;
        int bigCount = 0;

        for (int [] arraySmall: dobleArray) {

            int bigCountinSmallest = 0;


            for (int small: arraySmall) {
                bigCountinSmallest += small;
            }

            if (bigCount < bigCountinSmallest) {
                bigCount = bigCountinSmallest;
                smallIndex = i;
            }

            System.out.println(Arrays.toString(arraySmall)+ " " + bigCountinSmallest);

            i++;
        }

        System.out.println(smallIndex + " " + bigCount);

    }
}
