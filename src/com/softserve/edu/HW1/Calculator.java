package com.softserve.edu.HW1;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        double pi = 3.14;
        double P;
        double S;
        double r;

        System.out.print("Type circle radius:");
        Scanner sc = new Scanner(System.in);
        r = Double.parseDouble(sc.nextLine());
        S = pi*r*r;
        P = 2*pi*r;
        System.out.println("Square:" + S);
        System.out.println("Perimetr:" + P);
        sc.close();
    }
}
