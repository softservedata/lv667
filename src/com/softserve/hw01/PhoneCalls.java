package com.softserve.hw01;

import java.util.Scanner;

public class PhoneCalls {
    Scanner sc = new Scanner(System.in);

    private int getCost() {
        int c;
        int t;
        String nameCountry;
        System.out.println("\nEnter the name of the country: ");
        nameCountry = sc.nextLine();
        System.out.println("Enter call price in " + nameCountry);
        c = Integer.parseInt(sc.nextLine());
        System.out.println("Enter time for call in " + nameCountry);
        t = Integer.parseInt(sc.nextLine());
        int cost = t * c;
        System.out.println("Country: " + nameCountry + "\nCall price: " + c + "\nCall Time: "
                + t + "\nCost: " + cost);
        return cost;
    }
    public void costOfCalls() {
        int tc1 = getCost();
        int tc2 = getCost();
        int tc3 = getCost();
        int totalCost = tc1 + tc2 + tc3;

        //alternative solution via cycle
//        int totalCost = 0;
//        for (int i = 0; i < 3; i++) {
//            totalCost += getCost(); // the same as: totalCost = totalCost + getCost();
//        }
        System.out.println("\nTotal cost for all countries: " + totalCost);
        sc.close();
    }
}
