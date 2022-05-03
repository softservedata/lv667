package com.softserve.edu.hw4;

import java.util.Scanner;

public class MathOperation1 {
    //Ask user to enter the number of month.
    // Read the value and write the amount of days in this month (create array with amount days of each month).
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int num=0;
        int count =0;
        boolean a=true;
        while(a){
            System.out.println("Enter the number of month");
            num=Integer.parseInt(s.nextLine());
            if(num>0 & num<=arr.length){
                System.out.println("This month has "+ arr[num-1]+" days. "+"Its "+num+" month");
                a=false;
            }
        }

    }
}
