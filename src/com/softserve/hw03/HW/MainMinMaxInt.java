package com.softserve.hw03.HW;

import java.util.Scanner;

public class MainMinMaxInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number #" + (i + 1));
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        System.out.println("Max= " + max + ", Min = " + min);
    }
}
