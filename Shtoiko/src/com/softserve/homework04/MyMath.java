package com.softserve.homework04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Input first element, please.");
            int firstElement = scanner.nextInt();
            System.out.println("Input second element, please.");
            int secondElement = scanner.nextInt();
            System.out.println("\r\nResult:");
            System.out.println("Total:             " + (firstElement + secondElement));
            System.out.println("Difference:        " + (firstElement - secondElement));
            System.out.println("Multiplication:    " + (firstElement * secondElement));
            System.out.println("Division:          " + (firstElement / secondElement));
        } catch (ArithmeticException | InputMismatchException exception) {
            System.out.println("Incorrect input! " + exception);
        }
    }
}
