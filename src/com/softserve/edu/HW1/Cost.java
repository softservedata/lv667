package com.softserve.edu.HW1;
import java.util.Scanner;

public class Cost {

            public static int CountryCost(){
            int c;
            int t;
            int Cost;
            String nameCountry;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the country:");
            nameCountry = sc.nextLine();
            System.out.println("Enter call price in " + nameCountry + ":");
            c = Integer.parseInt(sc.nextLine());
            System.out.println("Enter time for call in " + nameCountry + ":");
            t = Integer.parseInt(sc.nextLine());
            Cost = c * t;
            System.out.println("Country:" + nameCountry + "\tCall price:" + c + "\tCall Time:" + t + "\tCost:" + Cost);
            return Cost;
        }

    public static void main(String[] args) {
        int TotalCost;
        int c1 = CountryCost();
        int c2 = CountryCost();
        int c3 = CountryCost();
        TotalCost = c1 + c2 + c3;
        System.out.println("Total cost for all countries: " + TotalCost);
        }
}
