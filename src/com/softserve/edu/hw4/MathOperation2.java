package com.softserve.edu.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class MathOperation2 {
    //Enter 10 integer numbers. 
    // Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        int a = 0;
        int sum = 0;
        int product = 1;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter " + (10 - i) + " integer numbers");
            a = Integer.parseInt(s.nextLine());
            arr[i] = a;
        }
        s.close();
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            if (j >= 4) {
                product = product * arr[j];
            }
        }
        System.out.println("product of last 5 element is " + product);
        System.out.println();
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] >= 0) {
                sum += arr[k];
            }
        }

        System.out.println("Sum positive numbers is = " + sum);
    }
    }
