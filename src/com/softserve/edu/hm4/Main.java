package com.softserve.edu.hm4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("enter radius:");
        Integer radius = sc.nextInt();
        Flowerbed obj1 = new Flowerbed(radius);
        System.out.println("Perimeter of a circle is 2*radius*π :" + obj1.getPerimeter());
        System.out.println("Area of a circle is π*radius^2 :" + obj1.getArea());

        Questionnaire qa = new Questionnaire();
        qa.askPersonInfo();
        System.out.println(qa.toString());

        Calls callsInfo = new Calls();
        System.out.println("enter call time for country code UA:");
        callsInfo.setTimeTalkUA(sc.nextFloat());
        System.out.println("enter call time for country code PL:");
        callsInfo.setTimeTalkPL(sc.nextFloat());
        System.out.println("enter call time for country code ENG:");
        callsInfo.setTimeTalkENG(sc.nextFloat());
        sc.nextLine();

        System.out.println("type onу of the country codes UA or PL or EN to get a single information or type \"All\" to get info about all calls");
        callsInfo.getInfo(sc.nextLine());
    }
}
