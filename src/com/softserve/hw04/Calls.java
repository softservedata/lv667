package com.softserve.hw04;

import java.util.Scanner;

public class Calls {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("c1 = ");
        double c1 = Double.parseDouble (sc.nextLine());
        System.out.print("t1 = ");
        double t1 = Double.parseDouble (sc.nextLine());
        System.out.print((c1 / 100) * t1 + " $");
        sc.nextLine();
        System.out.print("c2 = ");
        double c2 = Double.parseDouble (sc.nextLine());
        System.out.print("t2 = ");
        double t2 = Double.parseDouble (sc.nextLine());
        System.out.print((c2 / 100) * t2 + " $");
        sc.nextLine();
        System.out.print("c3 = ");
        double c3 = Double.parseDouble (sc.nextLine());
        System.out.print("t3 = ");
        double t3 = Double.parseDouble (sc.nextLine());
        System.out.print((c3 / 100) * t3 + " $");
        sc.nextLine();
        sc.close();
        System.out.print("total price = " + ((c1 * t1 + c2 * t2 + c3 * t3) / 100) + " $");

    }
}
