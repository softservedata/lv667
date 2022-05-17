package com.softserve.edu.HW3;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        int[] array = new int[3];
        int min, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number to comparison:");
        for (int i =0; i<3; i++){
            array[i] = sc.nextInt();
        }
        min = Math.min(array[0], Math.min(array[1], array[2]));
        max = Math.max(array[0], Math.max(array[1], array[2]));
        System.out.println("max " + max);
        System.out.println("min " + min);
        sc.close();
    }
}
