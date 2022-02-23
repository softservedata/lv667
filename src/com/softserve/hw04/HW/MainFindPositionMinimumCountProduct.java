package com.softserve.hw04.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainFindPositionMinimumCountProduct {
    public static void main(String[] args) {
        int array[] = {2, -2, 4, -2};
        int positiveCount = 0;
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    System.out.println("Position of second positive number is " + (i + 1));
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minimum) {
                minimum = array[i];
            }
        }
//        System.out.println("Position of min number is "+ (Arrays.binarySearch(array,minimum)+1));
//        System.out.println("Position of min number is "+ (Arrays.asList(array).indexOf(minimum)+1));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minimum)
                System.out.println("Position of min number is " + (i + 1));
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int number = sc.nextInt();
        int product = 1;

        List<Integer> positiveNumbers = new ArrayList<Integer>();
        while (number > 0) {
            positiveNumbers.add(number);
            number = sc.nextInt();
        }

//        System.out.println(Arrays.toString(positiveNumbers.toArray()));
        for (int i = 0; i < positiveNumbers.size(); i++) {
            if (positiveNumbers.get(i) % 2 != 0) {
                positiveNumbers.remove(positiveNumbers.get(i));
            }
        }
//        System.out.println(Arrays.toString(positiveNumbers.toArray()));
        for (int i = 0; i < positiveNumbers.size(); i++) {
            product = product * positiveNumbers.get(i);
        }
        System.out.println(product);
    }


}
