package com.softserve.hw.hm1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Task-1.
         * Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. Output obtained results.
         */
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter radius:");
        Integer radius = sc.nextInt();
        Flowerbed obj1 = new Flowerbed(radius);
        System.out.println("Perimeter of a circle is 2*radius*π :" + obj1.getPerimeter());
        System.out.println("Area of a circle is π*radius^2 :" + obj1.getArea());

        /**
         * Task-2.
         * Define String variables name and address. Output question "What is your name?".
         * Read the value name and output next question: “Where are you live, (name)?".
         * Read address and write whole information
         */
        Questionnaire qa = new Questionnaire();
        qa.askPersonInfo();
        System.out.println(qa.toString());

        /**
         * Task-3.
         * Phone calls from three different countries are с1, с2 and с3 standard units per minute.
         * Talks continued t1, t2 and t3 minutes.
         * How much computer will count for each call separately and all talk together?
         * Input all source data from console, make calculations and output to the screen
         */
        Calls callsInfo = new Calls();
        System.out.println("enter call time for country code UA:");
        callsInfo.setTimeTalkUA(sc.nextFloat());
        System.out.println("enter call time for country code PL:");
        callsInfo.setTimeTalkPL(sc.nextFloat());
        System.out.println("enter call time for country code ENG:");
        callsInfo.setTimeTalkENG(sc.nextFloat());
        sc.nextLine();

        System.out.println("Type one of the codes (UA, PL, EN) to get a single information \nOr type \"All\" to get info about all calls");
        callsInfo.getInfo(sc.nextLine());
    }
}
