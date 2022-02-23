package com.softserve.hw04.HW;

import java.util.Arrays;
import java.util.Collections;

public class MainSumFirst5IfProduсtLast5 {
    public static void main(String[] args) {
        int array[] = {2, -3, -4, 1, 2, 2, 4, 8, 1, 1};
        int sum = 0;
        int product = 1;

        for (int i = 0; i < 5; i++) {
            if (array[i] > 0)
                sum += array[i];
        }
        for (int i = array.length - 5; i < array.length; i++) {
            product = product * array[i];
        }

        System.out.println("Sum of first 5 elements = " + sum);
        System.out.println("Product of last 5 elements = " + product);
//        Arrays.sort(array);
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//        }
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.print(array[i]);
//        }

    }
}
