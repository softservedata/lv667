package com.softserve.edu06tst;

public class AppTst {

    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println("4 + 4 = " + calc.add(4, 4));
        System.out.println("20 / 4 = " + calc.div(20, 4));
    }
}
