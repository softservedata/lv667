package com.softserve.hw01;

import org.apache.commons.math3.util.Precision;

import java.util.Scanner;

public class FlowerBed {
    public void calculateAreaAndPerimeter() {
        Scanner sc = new Scanner(System.in);
        int r;
        //double perimeter;
        //double square;
        //double pi = Math.PI;
        System.out.println("Write the radius");
        r = Integer.parseInt(sc.nextLine());
        System.out.println("Radius: " + r);
        //perimeter = 2 * pi * r;
        //square = pi * Math.pow(r, 2);
        //System.out.println("Perimeter = " + Precision.round(perimeter, 2));
        System.out.println("Perimeter = " + Precision.round(calculatePerimeter(r), 2));
        //System.out.print("Square = " + Precision.round(square, 2));
        System.out.print("Square = " + Precision.round(calculateArea(r), 2));
        //System.out.format("%.2f",p);   // alternative round
        sc.close();
    }

    private double calculatePerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    private double calculateArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
