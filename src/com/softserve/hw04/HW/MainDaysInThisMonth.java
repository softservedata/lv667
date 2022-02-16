package com.softserve.hw04.HW;

import java.util.Scanner;

public class MainDaysInThisMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number of month: ");
        int numberMonth = sc.nextInt();
        int monthDays [] = {31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Number of month: "+numberMonth+", "+monthDays[numberMonth - 1]+" days");
    }
}