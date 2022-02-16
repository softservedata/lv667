package com.softserve.hw6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float min = -5f;
        float max = 5f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float: ");
        float num1 = Float.parseFloat (sc.nextLine());
        if (num1 >= min && num1 <= max) {
            System.out.print("Belongs to the range [-5,5] ");
        }
        else {
            System.out.print("Invalid");
        }
        sc.nextLine();
        System.out.print("Enter a float: ");
        float num2 = Float.parseFloat (sc.nextLine());
        if (num2 >= min && num2 <= max) {
            System.out.print("Belongs to the range [-5,5] ");
        }
        else {
            System.out.print("Invalid");
        }
        sc.nextLine();
        System.out.print("Enter a float: ");
        float num3 = Float.parseFloat (sc.nextLine());
        if (num3 >= min && num3 <= max) {
            System.out.print("Belongs to the range [-5,5] ");
        }
        else {
            System.out.print("Invalid");
        }
        sc.close();
    }
}