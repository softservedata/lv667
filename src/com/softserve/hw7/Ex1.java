package com.softserve.hw7;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[] monthDays;
        int n = 12;
        monthDays = new int[n];

        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;

        Scanner scan = new Scanner(System.in);
        System.out.print("Number of month from 0 to 11: ");
        int num = Integer.parseInt (scan.nextLine());
        if(num == 0)
        {
            System.out.println("31 days");
        }
        else if(num == 1)
        {
            System.out.println("28 days");
        }
        else if(num == 2)
        {
            System.out.println("31 days");
        }
        else if(num == 3)
        {
            System.out.println("30 days");
        }
        else if(num == 4)
        {
            System.out.println("31 days");
        }
        else if(num == 5)
        {
            System.out.println("30 days");
        }
        else if(num == 6)
        {
            System.out.println("31 days");
        }
        else if(num == 7)
        {
            System.out.println("31 days");
        }
        else if(num == 8)
        {
            System.out.println("30 days");
        }
        else if(num == 9)
        {
            System.out.println("31 days");
        }
        else if(num == 10)
        {
            System.out.println("30 days");
        }
        else if(num == 11)
        {
            System.out.println("31 days");
        }
        else
        {
            System.out.println("Invalid input! Please enter month number between (0-11).");
        }
        scan.close();

    }
}

