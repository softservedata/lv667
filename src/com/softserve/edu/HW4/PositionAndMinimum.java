package com.softserve.edu.HW4;

import java.util.Scanner;

public class PositionAndMinimum {
    public static void main(String[] args) {
        int array[] = new int[5];
        int positiveCount = 0;
        int minimum = array[0];
        int product = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type numbers:");
        for(int i = 0; i<5; i++){
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    System.out.println("Position of second positive number is: " + (i + 1));
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minimum) {
                minimum = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minimum)
                System.out.println("Position of min number is: " + (i + 1));
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                if((array[i] > 9 && array[i] < 100) || (array[i] > -100 && array[i] < -9)){
                    product *= array[i];
                }
            }
        }
        System.out.println("product of all entered even numbers: " + product);
    }
}
