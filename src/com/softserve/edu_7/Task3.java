/*
Enter 5 integer numbers. Find
position of second positive number;
minimum and its position in the array.
Organize entering integers until the first negative number. Count the product of all entered even numbers.
*/
package com.softserve.edu_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 5 numbers ");

        int arz[] = new int[5];
        for (int i = 0; i < arz.length; i++) {
            arz[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("5 numbers: " + Arrays.toString(arz));
        boolean z1 = false;
        for (int i = 0; i < arz.length; i++) {
            if (arz[i] >= 0 && z1 == false) {
                z1 = true;
            } else if (arz[i] >= 0 && z1 == true) {
                System.out.println("Position of second positive number: " + i);
                break;
            }
        }
        System.out.println("Minimum and its position in the array:");
        int min = 200000000;
        int pos = 0;
        for (int i = 0; i < arz.length; i++) {
            if (arz[i] < min) {
                min = arz[i];
                pos = i;
            }
        }
        System.out.println("Position min elements: " + pos);
        System.out.println("Min element: " + min);

        int art[] = new int[0];
        int product = 1;
        for (int i = 0; i < arz.length; i++) {
            if (arz[0] < 0) {
                System.out.println("First number is bellow 0.");
                break;
            } else if (arz[i] > 0) {
                art = new int[i];
                for (int j = 0; j < i; j++) {
                    art[j] = arz[j];

                }

            }
        }
        for (int i = 0; i < art.length; i++) {
            if (art[i] % 2 == 0 && arz[i] > 0) {
                product *= art[i];
            }
        }
        if (product != 1) {
            System.out.println("Product of this numbers is " + product);
        } else {
            System.out.println("No even numbers.");
        }
    }
}



















/*
                for (int x = 0; x < arz.length; x++) {
                    System.out.println("Enter " + (x + 1) + " number");
                    arz[x] = Integer.parseInt(br.readLine());
                    System.out.println(arz[1]);
                }
                boolean b1 = false;
                for (int x = 0; x < arz.length; x++) {
                    if (arz[x] >= 0 && b1 == false) {
                        b1 = true;
                    } else if (arz[x] >= 0 && b1 == true) {
                        System.out.println(x);
                    }
                }

                int total = 0;
        //Парні числа масива
        System.out.print("Парні числа масива: ");
        for (int i = 0; i < arz.length; i++) {
            if (arz[i] % 2 == 0) {
                System.out.print(arz[i] + ", ");
            }
            for (int i = 0; i < arz.length; i++) {
                total += arz[i];
            }
            System.out.println("Сумма: " + total);
        }

        // Непарні числа масива
        System.out.print("\nНепарні числа масива: ");
        for (int i = 0; i < arz.length; i++) {
            if (arz[i] % 2 != 0) {
                System.out.print(arz[i] + ", ");
            }
        }*/