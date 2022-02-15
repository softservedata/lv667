package com.softserve.homework07;

import java.util.Scanner;

public class Mounth {
    int request;

    public Mounth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mounth number");
        request = scanner.nextInt();
        scanner.close();
    }

    public void response() {
        switch (request) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28(29) days");
                break;
            default:
                System.out.println("Incorrect input.");
        }
    }
}
