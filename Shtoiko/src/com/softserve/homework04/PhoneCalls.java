package com.softserve.homework04;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.abs;

public class PhoneCalls {
    public static void main(String[] args) {
        int total = 0;
        int quantityOfCalls = 3;
        Scanner scanner = new Scanner(System.in);
        int[] callsCost = new int[quantityOfCalls];
        int[] talks = new int[quantityOfCalls];
        int[] sum = new int[quantityOfCalls];
        for (int i = 1; i <= quantityOfCalls; i++) {
            try {
                System.out.println("Input quantity standard units per minute for calls №" + i);
                callsCost[i - 1] = abs(scanner.nextInt());
                System.out.println("Input talks continued for calls №" + i);
                talks[i - 1] = abs(scanner.nextInt());
                sum[i - 1] = callsCost[i - 1] * talks[i - 1];
                total += sum[i - 1];
            } catch (InputMismatchException exception) {
                System.out.println("Incorrect input! " + exception);
            }
        }
        System.out.println("                units \r\n             per minute:   continued:      price:");
        for (int i = 1; i <= quantityOfCalls; i++) {
            System.out.printf("Call №%s   %10s   %10s     %10s%n",
                    i, callsCost[i - 1], talks[i - 1], sum[i - 1]);
            System.out.println("-------------------------------------------------------");
        }
        System.out.printf("Total:                                    %6s%n", total);
    }
}
