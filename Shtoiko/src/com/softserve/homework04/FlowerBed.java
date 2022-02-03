package com.softserve.homework04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FlowerBed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int radius = 0;
            System.out.println("Input radius please.");
            radius = scanner.nextInt();
            System.out.println(String.format("Perimeter :  %.2f", (2 * radius * Math.PI)));
            System.out.println(String.format("Area :       %.2f", (radius * radius * Math.PI)));
        } catch (InputMismatchException exception) {
            System.out.println("Incorrect input.");
        }
    }
}
