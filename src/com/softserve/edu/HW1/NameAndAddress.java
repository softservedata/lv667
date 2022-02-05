package com.softserve.edu.HW1;

import java.util.Scanner;

public class NameAndAddress {
    public static void main(String[] args) {
        System.out.println("Type your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Where are you from," + name + "?");
        String location = sc.nextLine();
        System.out.println("Name:" + name + "\nAddress:" + location);
        sc.close();
    }
}
