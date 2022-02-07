package com.softserve.edu.hw4;

import java.util.Scanner;

public class Just_scanner {

    public void requestinputData(String QvalStr) {
        System.out.println(QvalStr);
    }

    static String inputData() {
        Scanner currentValue = new Scanner(System.in);
        return currentValue.nextLine();
    }
    static float inputData(float f) {
        Scanner currentValue = new Scanner(System.in);
        float r;
        while (currentValue.hasNext()) {
            if (currentValue.hasNextFloat()) {
                //System.out.println("Found Float: ");
                return currentValue.nextFloat();
            }
            System.out.println(currentValue.next() + " isn't float. E.g. type 15 or 10,05");
            return inputData(0.0f);
        }
        return inputData(0.0f);
    }


}