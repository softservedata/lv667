package com.softserve.homework04;

import java.util.Scanner;
import static java.lang.Math.abs;

public class PhoneCalls {
    public static void main(String[] args) {
        int total = 0;
        int quantityOfCalls = 3;
        Scanner scanner = new Scanner(System.in);
        int[] callsCost = new int[quantityOfCalls];
        int[] talks = new int[quantityOfCalls];
        for(int i = 1; i <= quantityOfCalls; i++) {
            System.out.println("Input quantity standard units per minute for calls №" + i);
            callsCost[i - 1] = abs(scanner.nextInt());
        }
        for(int i = 1; i <= quantityOfCalls; i++) {
            System.out.println("Input talks continued for calls №" + i);
            talks[i - 1] = abs(scanner.nextInt());
        }
        System.out.println("                units \r\n             per minute:   continued:      price:");
        for(int i = 1; i <= quantityOfCalls; i++) {
            int sum = callsCost[i - 1] * talks[i - 1];
            System.out.println(String.format("Call №%s   %10s   %10s     %10s",
                    i, callsCost[i - 1], talks[i - 1], sum));

                    System.out.println("-------------------------------------------------------");
            total += sum;
        }
        System.out.println(String.format("Total:                                    %6s", total));
    }
}
