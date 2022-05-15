package com.softserve.edu.hw04;

import java.util.Scanner;

public class Appl {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int select = 0;

        while(true)
        {
            System.out.println("[1] - Task_1");
            System.out.println("[2] - Task_2");
            System.out.println("[3] - Task_3");
            System.out.println("[0] - EXIT");

            System.out.print  ("\r\nInput : ");
            try {
                select = Integer.parseInt(cin.nextLine());
            }
            catch (NumberFormatException e){
                select = 999;
            }

            if(select == 1) {
                Task1();

                System.out.println("\r\nPress any key to back");
                //clean = cin.nextLine();
            }

            else if(select == 2) {
                Task2();

                System.out.println("\r\nPress any key to back");
                //clean = cin.nextLine();
            }

            else if(select == 3) {
                Task3();

                System.out.println("\r\nPress any key to back");
                //clean = cin.nextLine();
            }

            else if(select == 0) break;

            else
            {
                System.out.println("Unknown command please try again\n");
                System.out.println("Press any key to back");

                //clean = cin.nextLine();
            }
        }

    }

    public static void Task1() {
        Scanner cin = new Scanner(System.in);
        double radius = 0;

        double pi = 3.14159265;

        System.out.println("\r\nZZZZZZZZZZ TASK_1 ZZZZZZZZZZ\r\n");
        System.out.println("Flower bed is shaped like a circle");

        System.out.print  ("Input radius of circle: ");
        while (cin.hasNext()) {
            try {
                radius = Double.parseDouble(cin.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Input is incorrect, please try again");
                System.out.print  ("Input radius of circle: ");
            }
        }

        System.out.println(" ");
        System.out.println("Radius    : " + radius + " \t\t\tm");
        System.out.println("Diameter  : " + radius * 2.0 + " \t\t\tm");
        System.out.println("Perimeter : " + radius * 2.0 * pi + " \t\tm");
        System.out.println("Area      : " + radius * radius * pi + " \tm2 \r\n" );

        System.out.println("ZZZZZZZZZZ _END_ ZZZZZZZZZZ");
    }

    public static void Task2() {

        Scanner cin = new Scanner(System.in);

        System.out.println("\r\nZZZZZZZZZZ TASK_2 ZZZZZZZZZZ\r\n");

        System.out.println("What is your name?");
        System.out.print  ("Input : ");
        String name = cin.nextLine();

        System.out.println("\r\nWhere do you live?");
        System.out.print  ("Input : ");
        String address = cin.nextLine();

        System.out.println("\r\nHello " + name + ", from " + address);
        System.out.println("I'm T-800, I'll come soon");

        System.out.println("\r\nZZZZZZZZZZ _END_ ZZZZZZZZZZ");
    }

    public static void Task3() {

        Scanner cin = new Scanner(System.in);

        double c1;
        double c2;
        double c3;

        double t1;
        double t2;
        double t3;

        System.out.println("\r\nZZZZZZZZZZ TASK_3 ZZZZZZZZZZ\r\n");

        System.out.println("How many cost 1 minute of talk in first country?");
        System.out.print("Input: ");
        c1 = cin.nextDouble();

        //Cleaning buffer
        String clean = cin.nextLine();

        System.out.println("\r\nHow many cost 1 minute of talk in second country?");
        System.out.print("Input: ");
        c2 = cin.nextDouble();

        //Cleaning buffer
        clean = cin.nextLine();

        System.out.println("\r\nHow many cost 1 minute of talk in third country?");
        System.out.print("Input: ");
        c3 = cin.nextDouble();

        //Cleaning buffer
        clean = cin.nextLine();

        System.out.println("\r\nHow many continued first talk?");
        System.out.print("Input: ");
        t1 = cin.nextDouble();

        //Cleaning buffer
        clean = cin.nextLine();

        System.out.println("\r\nHow many continued second talk?");
        System.out.print("Input: ");
        t2 = cin.nextDouble();

        //Cleaning buffer
        clean = cin.nextLine();

        System.out.println("\r\nHow many continued third talk?");
        System.out.print("Input: ");
        t3 = cin.nextDouble();

        //Cleaning buffer
        clean = cin.nextLine();

        System.out.println("c1: " + c1 + " c2: " + c2 + " c3: " + c3 + "\r\n");

        System.out.println("First  talk continued " + t1 + " min and cost " + t1 * c1);
        System.out.println("Second talk continued " + t2 + " min and cost " + t2 * c2);
        System.out.println("Third  talk continued " + t3 + " min and cost " + t3 * c3);

        System.out.println("\r\nTotal cost :" + (t1 * c1 + t2 * c2 + t3 * c3));

        System.out.println("\r\nZZZZZZZZZZ _END_ ZZZZZZZZZZ");

    }
}
