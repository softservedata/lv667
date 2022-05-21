package com.softserve.edu.HW4;

import java.util.Scanner;
public class SumProduct {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        int[] array = new int[11];
        Scanner sc = new Scanner(System.in);
        System.out.print("Type numbers:");
        for(int i = 0; i<10; i++){
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (array[i] > 0)
                sum += array[i];
        }
        for (int i = array.length - 5; i < array.length; i++) {
            product *= array[i];
        }

        System.out.println("Sum of first 5 elements = " + sum);
        System.out.println("Product of last 5 elements = " + product);
    }
}
