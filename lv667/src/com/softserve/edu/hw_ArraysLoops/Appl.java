package com.softserve.edu.hw_ArraysLoops;

import java.util.Arrays;
import java.util.Scanner;
import com.softserve.edu.hw_ArraysLoops.Car;

public class Appl {
    static Car[] autos = new Car [4];

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int select;

        while (true) {
            System.out.println("\n[1] Task 1");
            System.out.println("[2] Task 2");
            System.out.println("[3] Task 3");
            System.out.println("[4] Task 4");
            System.out.println("[0] Exit");

            System.out.print("\nInput :");
            select = Integer.parseInt(cin.nextLine());

            if (select == 1) Task1();
            else if (select == 2) Task2();
            else if (select == 3) Task3();
            else if (select == 4) Task4();
            else if (select == 0) break;

            else System.out.println("\nInput is incorrect");

        }
    }

    public static void Task1() {
        int year = 2022;

        String[] monthName = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};

        Scanner cin = new Scanner(System.in);
        int select;

        System.out.println("\nZZZZZZZZZZ TASK_1 ZZZZZZZZZZ\n");
        while (true) {
            System.out.println("Current year - " + year);
            System.out.println("[1] Change year");
            System.out.println("[2] Get info about month");
            System.out.println("[0] Back");
            System.out.print("\nInput :");

            select = Integer.parseInt(cin.nextLine());

            if (select == 1) {
                System.out.print("\nInput new year:");
                year = Integer.parseInt(cin.nextLine());

                if ((year % 4 == 0) || (year % 100 == 0 && year % 400 == 0)) {
                    monthDays[1] = 29;
                } else monthDays[1] = 28;
            }

            else if (select == 2) {
                System.out.print("\nInput number of month: ");
                int num = Integer.parseInt(cin.nextLine());

                System.out.println("Month - " + monthName[(num - 1)] + " has " + monthDays[(num - 1)] + " days");

                System.out.println("\nPress any key to back");
                String t = cin.nextLine();
                break;
            }

            else if (select == 0) break;

            else System.out.println("Command is incorrect");
        }
    }

    public static void Task2() {
        int[] ints = new int[10];
        int result = 0;
        boolean isPositive = true;

        System.out.println("\nTASK_2\n");
        System.out.println("Enter 10 numbers");

        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ": ");
            ints[i] = Integer.parseInt(cin.nextLine());

            if(i < 5 && ints[i] < 0) isPositive = false;
        }

        if(isPositive){
            for (int i = 0; i < 5; i++) {
                result = result + ints[1];
            }

            System.out.println("\nFirst 5 elements are positive");
            System.out.println("Sum of first five: " + result);

            System.out.println("\nPress any key to exit");
            String t = cin.nextLine();
        }

        else{
            result = 1;
            for (int i = 0; i < 5; i++) {
                result = result * ints[i];
            }

            System.out.println("\nFirst 5 elements are not positive");
            System.out.println("Product of last five: " + result);

            System.out.println("\nPress any key to exit");
            String t = cin.nextLine();
        }
    }

    public static void Task3() {
        int[] ints = new int[10];
        int posOfSecPositive = -1;

        System.out.println("\nZZZZZZZZZZ TASK_3 ZZZZZZZZZZ\n");

        System.out.println("Input 5 numbers");

        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ": ");
            ints[i] = Integer.parseInt(cin.nextLine());
        }

        //Searching position of second positive
        for (int i = 0; i < 5; i++) {
            if(ints[i] > 0 && posOfSecPositive >= 0) {
                posOfSecPositive = i;
                break;
            }

            if(ints[i] > 0) {
                posOfSecPositive = i;
            }
        }
        //

        //Searching position of minimal
        int min = Integer.MAX_VALUE;
        int posOfMin = -1;
        for (int i = 0; i < 5; i++) {
            if(ints[i] < min) {
                min = ints[i];
                posOfMin = i;
            }
        }
        //

        System.out.println("\nPosition of second positive: " + posOfSecPositive);
        System.out.println("Minimal - " + min + ".Position of minimal: " + posOfMin);

        System.out.println("\nPress any key to back");
        String t = cin.nextLine();
    }

    public static void Task4() {
        System.out.println("\nZZZZZZZZZZ TASK_4 ZZZZZZZZZZ\n");

        autos[0] = new Car("VW", "Passat B5", 2002, 1900);
        autos[1] = new Car("VW", "Passat B6", 2007, 2000);
        autos[2] = new Car("VW", "Passat B7", 2012, 2000);
        autos[3] = new Car();
        autos[3].input();

        while (true) {
            Scanner cin = new Scanner(System.in);
            int select1;


            System.out.println("\n[1] Display cars by year");
            System.out.println("[2] Display cars sorted by year");
            System.out.println("[0] Exit");

            System.out.print("\nInput :");
            select1 = Integer.parseInt(cin.nextLine());

            if (select1 == 1) {
                System.out.print("\n Input year: ");
                int year = Integer.parseInt(cin.nextLine());

                for (int i = 0; i < 4; i++) {
                    if (autos[i].getYear() == year) {
                        autos[i].output();
                    }
                }

                System.out.println("\nPress any key to back");
                String t = cin.nextLine();
            } else if (select1 == 2) {
                Arrays.sort(autos);
                for (int i = 0; i < 4; i++) {
                    autos[i].output();
                }
            }
            else if (select1 == 0) {
                break;
            }

            else {
                System.out.println("\nInput is incorrect");

                System.out.println("\nPress any key to back");
                String t = cin.nextLine();
            }

        }
    }
}