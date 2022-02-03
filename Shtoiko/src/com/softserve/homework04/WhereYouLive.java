package com.softserve.homework04;

import java.util.Scanner;

public class WhereYouLive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where are you live, " + name + "?");
        String adress = scanner.nextLine();
        System.out.println(name + " lives at the " + adress);
    }
}
