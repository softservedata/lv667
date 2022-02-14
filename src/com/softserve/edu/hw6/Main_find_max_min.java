package com.softserve.edu.hw6;

import java.util.Scanner;

public class Main_find_max_min {
    private int i1, i2, i3, max, min;

    private Main_find_max_min() {

    }

    private Main_find_max_min(int i1, int i2, int i3) {
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
        this.max = i1;
        this.min = i1;
    }

    public static void main(String[] args) {
        Main_find_max_min objMaxMin = new Main_find_max_min(inputFloat("Input i1:"), inputFloat("Input i2:"), inputFloat("Input i3:"));
        //objMaxMin.findMaxMin(objMaxMin.i1);
        //objMaxMin.findMaxMin(objMaxMin.i2);
        //objMaxMin.findMaxMin(objMaxMin.i3);
        objMaxMin.normalwayfindMaxMin();
        objMaxMin.printOut();
    }

    public static int inputFloat(String txt) {
        Scanner floatValue = new Scanner(System.in);
        System.out.println(txt);
        int inputI = floatValue.nextInt();
        return inputI;
    }

//    public void findMaxMin(int number) {
//        if(number > this.max) {
//            this.max = number;
//        }
//        if(number < this.min) {
//            this.min = number;
//        }
//
//    }

    public void normalwayfindMaxMin() {
        this.min = Math.min(this.i1, Math.min(this.i2, this.i3));
        this.max = Math.max(this.i1, Math.max(this.i2, this.i3));
    }

    public void printOut() {
        System.out.println(this.i1 + " " + this.i2 + " " + this.i3);
        System.out.println("max " + this.max);
        System.out.println("min " + this.min);
    }

}
