package com.softserve.hw04;

import java.util.Scanner;

public class NameAndAddress {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello!");
        try {
            Thread.sleep(2500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.print("Where are you living, " + name + "? ");
        String address = sc.nextLine();
        System.out.println("The whole information: " + name + ", " + address + ". ");
        try {
            Thread.sleep(2500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Thank you...");
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\r" + name + ".");
        sc.close();

    }

}
