package com.softserve.edu_07;

import java.util.Scanner;

//Ask user to enter the number of month. Read the value and write the amount of days in this month (create array with amount days of each month).
//Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
//Enter 5 integer numbers. Find
//position of second positive number;
//minimum and its position in the array.
//Organize entering integers until the first negative number. Count the product of all entered even numbers.
//Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
//certain model year  (enter year in the console);
//ordered by the field year.
//Add Unit Tests to each task, publish code on GitHub
public class Homework_07 {
    public static void main(String[] args) {
        System.out.println("Write number of month");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println("I write " + month);
        int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Days in month = " + monthDays[month]);
    }
}
