package com.softserve.edu.hw.hm4;

import java.util.Scanner;

public class Minmax {

    // class description
    private int a;
    private int b;
    private int c;

    public Minmax(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter int a:");
        this.a = sc.nextInt();
        System.out.println("enter int b:");
        this.b = sc.nextInt();
        System.out.println("enter int c:");
        this.c = sc.nextInt();
    }

    public Minmax(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void maxOfThree(){
        System.out.println("max number is :" + Math.max(a , Math.max(b,c)));
    }

    public void minOfThree(){
        System.out.println("min number is :" +Math.min(a , Math.min(b,c)));
    }

}
