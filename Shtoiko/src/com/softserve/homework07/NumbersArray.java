package com.softserve.homework07;

import java.util.Scanner;

public class NumbersArray {
    int[] numbers = new int[10];
    int result = 0;

    NumbersArray() {
        System.out.println("Enter numbers");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public int run() {
        for (int i = 0; i < 5; i++) {
            if (result < (result += numbers[i])) {
            } else {
                return runProduct();
            }
        }
        return result;
    }

    private int runProduct() {
        result = 1;
        for (int i = 5; i < numbers.length; i++) {
            result = result * numbers[i];
        }
        return result;
    }
}

