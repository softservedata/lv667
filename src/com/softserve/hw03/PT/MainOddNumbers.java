package com.softserve.hw03.PT;

import java.util.Scanner;

public class MainOddNumbers {
    public static void main(String[] args) {
        boolean result;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number: ");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                count++;
                result = true;
            } else result = false;
        }
        System.out.println("Number of pairs: " + count);
    }
}
