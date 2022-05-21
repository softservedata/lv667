package com.softserve.edu.HW4;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter number of month: ");
        int numberMonth = sc.nextInt();
        int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        switch(numberMonth){
            case(1):System.out.println("Number of month: " + numberMonth + ", " + "January, " + monthDays[numberMonth - 1] + " days");break;
            case(2):System.out.println("Number of month: " + numberMonth + ", " + "February, " + monthDays[numberMonth - 1] + " days");break;
            case(3):System.out.println("Number of month: " + numberMonth + ", " + "March, " + monthDays[numberMonth - 1] + " days");break;
            case(4):System.out.println("Number of month: " + numberMonth + ", " + "April, " + monthDays[numberMonth - 1] + " days");break;
            case(5):System.out.println("Number of month: " + numberMonth + ", " + "May, " + monthDays[numberMonth - 1] + " days");break;
            case(6):System.out.println("Number of month: " + numberMonth + ", " + "June, " + monthDays[numberMonth - 1] + " days");break;
            case(7):System.out.println("Number of month: " + numberMonth + ", " + "July, " + monthDays[numberMonth - 1] + " days");break;
            case(8):System.out.println("Number of month: " + numberMonth + ", " + "August, " + monthDays[numberMonth - 1] + " days");break;
            case(9):System.out.println("Number of month: " + numberMonth + ", " + "September, " + monthDays[numberMonth - 1] + " days");break;
            case(10):System.out.println("Number of month: " + numberMonth + ", " + "October, " + monthDays[numberMonth - 1] + " days");break;
            case(11):System.out.println("Number of month: " + numberMonth + ", " + "November, " + monthDays[numberMonth - 1] + " days");break;
            case(12):System.out.println("Number of month: " + numberMonth + ", " + "December, " + monthDays[numberMonth - 1] + " days");break;
        }
        sc.close();
    }
}
