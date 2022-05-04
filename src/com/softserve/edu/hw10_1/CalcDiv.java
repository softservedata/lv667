package com.softserve.edu.hw10_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalcDiv {
    //ловимо ділення на 0 з інтовими числами
    public double div1(int x, int y) {
        double res1 = 0.0;
        try {
            res1 = x / y;
        } catch (ArithmeticException e1) {
            System.out.println("Error catched division by Zero + " + e1.getMessage());
        }
        return res1;
    }
    //ловимо ділення на 0 з дабл числами
    public static double div2(double x, double y) throws ArithmeticException {
        double res2 = 0.0;
        if (y == 0.0) {
            throw new ArithmeticException();
        }
        return res2 = x / y;
    }


    public static void main(String[] args) {
        CalcDiv c1 = new CalcDiv();//так як метод не статичний, я створив об'єкт класу де є цей метод
        int i1 = 25;
        int i2 = 0;
        System.out.println("div1 (i1/i2) = " + c1.div1(i1, i2));

        System.out.println("//////////////////////////////");

        double d1 = 25.7;
        double d2 = 0;
        double res3;
        try {
            res3 = div2(d1,d2);
        } catch (ArithmeticException e1) {
            System.out.println("Division by 0 " + e1);
            res3 = -0.0;
        }
        System.out.println("div2 (d1/d2) = " + res3);
    }
}

