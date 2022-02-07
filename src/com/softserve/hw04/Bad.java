package com.softserve.hw04;

import java.util.Scanner;

public class Bad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The radius is: ");
        double radius = Double.parseDouble (sc.nextLine());
        double perimeter = (2 * 3.141592653589793 * radius);
        System.out.println("Perimeter of circle is: " + perimeter);
        double area = (3.141592653589793 * radius * radius);
        System.out.println("Area of circle is: " + area);
        System.out.println();
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The answer is: " + perimeter +", " + area + ". ");
        sc.close();
    }

}
