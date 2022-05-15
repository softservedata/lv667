package com.softserve.edu.hw_Exceptions;

public class Appl {
    public static void main(String[] args) {
        System.out.println(div(1, 1));
    }
    
    static double div(double d1, double d2) {
        double res = 0;
        try {
            if (d2 == 0) {
                throw new ArithmeticException();
            }

            res = d1 / d2;

        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            return res;
        }
    }
}
