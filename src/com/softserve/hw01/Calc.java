package com.softserve.hw01;

import java.util.Scanner;

    public class Calc {
        public void calcInteger() {
            Scanner sc = new Scanner(System.in);
            double a, b;
            System.out.println("Enter integers a = ");
            a = sc.nextDouble();
            System.out.println("Enter integers b = ");
            b = sc.nextDouble();
            double addition = a + b;
            System.out.print("a + b = ");
            System.out.format("%.0f",addition);
            double subtraction = a - b;
            System.out.print("\r\na - b = ");
            System.out.format("%.0f",subtraction);
            double multiply = a * b;
            System.out.print("\r\na * b = ");
            System.out.format("%.0f",multiply);
            double division = a / b;
            System.out.print("\r\na / b = ");
            System.out.format("%.3f", division);
            sc.close();
        }
    }