package main.java.com;

import java.util.Scanner;

public class Task2 {
    public static void result() {
        Scanner sc = new Scanner(System.in);
        int number1 = 0;
        int number2 = 1;
        int next = 0;
        System.out.println("Fibocchi");
        int n = Integer.parseInt(sc.nextLine());
        while (next <= n) {
            number1 = number2;
            number2 = next;
            next = number1 + number2;
            System.out.println(next);
        }
    }
}