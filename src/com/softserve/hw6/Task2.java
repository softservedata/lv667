package com.softserve.hw6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter int: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Enter int: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.print("Enter int: ");
        int c = Integer.parseInt(sc.nextLine());
        sc.close();
        int result = (int) maximum(a, b, c);
        System.out.println("Maximum is: " + result);
        int result1 = (int) minimum(a, b, c);
        System.out.println("Minimum is: " + result1);
    }

    public static int maximum(int a, int b, int c) {
        int maximumValue = a;

        if (b > maximumValue)
            maximumValue = b;

        if (c > maximumValue)
            maximumValue = c;

        return (int) maximumValue;
    }

    private static int minimum(int a, int b, int c) {
        int minimumValue = a;

        if (b < minimumValue)
            minimumValue = b;

        if (c < minimumValue)
            minimumValue = c;

        return (int) minimumValue;
    }
}
