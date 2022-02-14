package com.softserve.hw03.HW;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter number #" +i);
            float x = sc.nextFloat();
            if (x >= -5 && x <= 5) {
                System.out.println(x+" belong to the range [-5,5]");
            }else {
                System.out.println(x+" not belong to the range [-5,5]");
            }

        }
    }
}