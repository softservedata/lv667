package com.softserve.edu.hw4;

import java.text.DecimalFormat;

public class Calculate_area_perimeter {
    public static void main(String[] args) {
        Just_scanner myScan = new Just_scanner();
        double r, P, A;

        myScan.requestinputData("Enter flower bad radius (m):");
        r = myScan.inputData(0.0f);
        P = (float) (Math.PI*Math.pow(r, 2));
        A = (float) (2*Math.PI*r);
        System.out.println("Perimeter flower bad = " +new DecimalFormat("##.##m").format(P));
        System.out.println("Area flower bad = " +new DecimalFormat("##.##m").format(A));
    }
}