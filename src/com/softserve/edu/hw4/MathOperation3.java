package com.softserve.edu.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class MathOperation3 {
    //Enter 5 integer numbers. Find
    //position of second positive number;
    //minimum and its position in the array.
    //Organize entering integers until the first negative number. Count the product of all entered even numbers.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = 0;
        int[] arr = new int[5];
        int count = 0;
        int numberOfSecondPositiveNum = 0;
        int min = arr[0];
        int positionOfMinimalNum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (5 - i) + " integer numbers");
            a = Integer.parseInt(s.nextLine());
            arr[i] = a;
        }
        s.close();
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] > 0) {
                count++;
                numberOfSecondPositiveNum = k;
            } else {
                continue;
            }

        }
        switch (count) {
            case 0:
                System.out.println("There is no one positive numbers");
                break;
            case 1:
                System.out.println("There is only one positive numbers and his position is " + numberOfSecondPositiveNum);
                break;
            case 2:
                System.out.println("Position of second positive number is " + numberOfSecondPositiveNum);
                break;

        }
        System.out.println();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
                positionOfMinimalNum = j;
            }
        }
        System.out.println("Minimal number is " + min + " position of minimal number is " + positionOfMinimalNum);
    }
}
