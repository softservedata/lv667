package com.softserve.hw04.PT;

import java.util.Arrays;

public class MainArrayOfTenIntegers {
    public static void main(String[] args) {
        int array[] = {-2, -4, -2, 6, 3, 1, 2, 1, -4, 5};
        int max = 0;
        int sum = 0;
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (array[i] > 0)
                sum += array[i];
            if (array[i] < 0)
                negative++;
            else positive++;
        }
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("\n\rBiggest of these numbers in array: " + max);
        System.out.println("Sum of positive numbers in array: " + sum);
        System.out.println("Amount of negative numbers in array: " + negative);
//        if (positive > negative)
//            System.out.println("positive");
//        else
//            System.out.println("negative");
        System.out.println("Values there are more: " + ((positive > negative) ? "positive" : "negative"));
    }
}
