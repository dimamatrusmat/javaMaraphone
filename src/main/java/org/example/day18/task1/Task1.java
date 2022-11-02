package org.example.day18.task1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(recursionSum(new int[] {1,2}));
    }

    public static int recursionSum(int[] numbers) {

        int len = numbers.length;

        if (len == 1) {
            return numbers[0];
        }

        if (numbers[len] != 0) {
            return recursionSum(numbers);
        } else {
            return recursionSum(numbers);
        }


    }
}
