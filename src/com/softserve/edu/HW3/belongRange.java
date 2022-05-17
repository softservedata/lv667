package com.softserve.edu.HW3;

import java.util.Scanner;

public class belongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write three numbers");
        float first = sc.nextFloat();
        if (first >= -5 && first <= 5) {
            System.out.println(first+" in range [-5,5]");
        }else {
            System.out.println(first+" not in range [-5,5]");
        }
        float second = sc.nextFloat();
        if (second >= -5 && second <= 5) {
            System.out.println(second+" in range [-5,5]");
        }else {
            System.out.println(second+" not in range [-5,5]");
        }
        float third = sc.nextFloat();
        if (third >= -5 && third <= 5) {
            System.out.println(third+" in range [-5,5]");
        }else {
            System.out.println(third+" not in range [-5,5]");
        }
        sc.close();
    }
}
