package com.softserve.edu.hw1;

public class Widening_Casting {
    public static void main(String[] args) {
        int simpleInt = 99999;
        float simpleFlt = simpleInt;
        double simpleDouble = simpleInt;
        //String justChr = (String) simpleInt;
        String justChr = Integer.toString(simpleInt);

        System.out.println(simpleInt);
        System.out.println(simpleFlt);
        System.out.println(simpleDouble);
        simpleDouble = simpleDouble + 2;
        System.out.println(simpleDouble);

        System.out.println("Рядок "+justChr);

        justChr = justChr+2;
        System.out.println("Рядок 2 "+justChr);
    }
}
