package com.softserve.hw7;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num1 = Integer.parseInt (sc.nextLine());
        System.out.print("Enter an integer: ");
        int num2 = Integer.parseInt (sc.nextLine());
        System.out.print("Enter an integer: ");
        int num3 = Integer.parseInt (sc.nextLine());
        System.out.print("Enter an integer: ");
        int num4 = Integer.parseInt (sc.nextLine());
        System.out.print("Enter an integer: ");
        int num5 = Integer.parseInt (sc.nextLine());
        System.out.print("Enter an integer: ");
        int num6 = Integer.parseInt (sc.nextLine());
        System.out.print("Enter an integer: ");
        int num7 = Integer.parseInt (sc.nextLine());
        System.out.print("Enter an integer: ");
        int num8 = Integer.parseInt (sc.nextLine());
        System.out.print("Enter an integer: ");
        int num9 = Integer.parseInt (sc.nextLine());
        System.out.print("Enter an integer: ");
        int num10 = Integer.parseInt (sc.nextLine());
        sc.close();
        int sum = num1 + num2 + num3 + num4 + num5;
        if (num1 > 0 & num2 > 0 &  num3 > 0 & num4 > 0 & num5 > 0) {
            System.out.println("The sum of first 5 numbers: " + sum);
        }
        else {
            System.out.println("The last 5 elements: " + num6 + ", " + num7 + ", " + num8 + ", " + num9 + ", " + num10 + ". ");
        }

    }

}
