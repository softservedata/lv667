package com.softserve.edu04;

import java.util.Scanner;

public class AppScan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello. What is your name: ");
        String name = sc.nextLine();
        System.out.print("How old are you: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Hello " + name);
        System.out.println("   You are " + age);
        //
        System.out.print("Input int value: ");
        age = sc.nextInt();
        System.out.print("Input String value: ");
        name = sc.nextLine();
        name = sc.nextLine();
        sc.close();
    }
}
