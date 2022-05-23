package com.softserve.edu_13;

import java.util.Scanner;

/*
   Create method div(), which calculates the dividing of two double numbers. In main method input 2 double numbers and call
this method. Catch all exceptions.
   Write a method readNumber(int start, int end), that read from console integer number and return it, if it is in the
range [start...end].
   If an invalid number or non-number text is read, the method should throw an exception.
Using this method write a method main(), that has to enter 10 numbers:
	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
Refactor your previous homework (1-7) and try to handle all possible exceptions in your code.
*/
public class Task {
    public static void main(String[] args) {
        Task task = new Task();
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        try {
            System.out.println(task.div(2.7, 2.1));
            for (int i = 0; i < a.length; i++) {
                try {
                    System.out.println("Number is range: " + task.readNumber(0, 10, a[i]));
                }catch (ArithmeticException e){
                    System.out.println("Number not is range: ");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Divide by zero.");
        }
    }

    public double div(double a, double b) throws NumberFormatException {
        if (b != 0) {
            return a / b;
        } else {
            throw new NumberFormatException();
        }
    }

    public int readNumber(int start, int end, int a) throws ArithmeticException {
        int resoult = a;
        if (resoult > start && resoult < end) {
            return resoult;
        } else {
            throw new ArithmeticException();
        }
    }

}
