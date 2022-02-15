package com.softserve.homework07;

import java.util.Scanner;

public class MyArray {
    int numbersQuantity = 5;
    int[] array = new int[numbersQuantity];

    public MyArray() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        secondPositiveNumber();
        searchMin();
        productOfFirstPositiveNumbers();
    }

    private void secondPositiveNumber() {
        int firstPositiveNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (firstPositiveNumber != 0) {
                    System.out.println("Second positive number is " + array[i]);
                    return;
                }
                firstPositiveNumber = array[i];
            }
        }
        System.out.println("Second positive number not found");
    }

    private void searchMin() {
        int min = array[0];
        int minPosition = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minPosition = i;
            }
        }
        System.out.println("Minimum element is " + min + " at " + (minPosition + 1) + " position");
    }

    private void productOfFirstPositiveNumbers() {
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                result = result * array[i];
            } else {
                break;
            }
        }
        System.out.println("Product of firsts positive numbers is " + result);
    }


}
