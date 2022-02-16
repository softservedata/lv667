package com.softserve.edu_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 10 numbers ");

        int arr[] = new int[10];
        for (int x = 0; x < arr.length; x++) {
            arr[x] = Integer.parseInt(br.readLine());
        }

        int adcount = 0;
        int uncount = 0;
        int sum = 0;
        int product = 1;

        for (int y = 0; y < arr.length; y++) {

            if (arr[y] > 0 && y < arr.length / 2 && uncount == 0) {
                sum += arr[y];
                adcount++;
            } else if (y < 5) {
                uncount++;
            } else if (y >= 5) {
                product *= arr[y];
            }
        }
        if (adcount > uncount) System.out.println("sum of this numbers is " + sum);
        else System.out.println("product of this numbers is " + product);
    }
}
