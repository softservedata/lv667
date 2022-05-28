package com.softserve.edu.hm4;
import java.util.Scanner;


/*
* read 3 float numbers and check: are they all belong to the range [-5,5];
* */

public class Belong {

    // class description
    private float a;
    private float b;
    private float c;

    public Belong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter float a:");
        this.a = sc.nextFloat();
        System.out.println("enter float b:");
        this.b = sc.nextFloat();
        System.out.println("enter float c:");
        this.c = sc.nextFloat();
    }

    public Belong(float a, float b, float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void inRange(){
        if (a>=-5 && a<=5 && b>=-5 && b<=5 && c>=-5 && c<=5){
            System.out.println("all vars are in range [-5;5]");
        }else{
            System.out.println("there are vars out of range [-5;5]");
        }
    }
}
