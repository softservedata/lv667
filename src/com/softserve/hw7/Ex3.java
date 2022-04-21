package com.softserve.hw7;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;;
        int isecond_max =  0;
        int imin =  0;
        int sum = 0;

        System.out.print("Enter the number of elements in an array: ");
        int n = scan.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter the elements of the array " + (i + 1)  + ": ");
            arr[i] = scan.nextInt();//takes input from user for array
        }

        //Comparing with each element and find maximum element

        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        //Finding Second largest element.
        //Comparing with each element and also checking it is not equal to max

        for(int i = 0; i < n; i++) {
            if(arr[i] > second_max && arr[i] != max) {
                isecond_max = i;
                second_max = arr[i];
            }

        }

        System.out.print("\nSecond largest value is: " + second_max + ", position is " + (isecond_max + 1) + ".");

        for(int i = 0; i < n; i++) {
            if(min > arr[i]) {//loop for find minimum elements
                imin = i;
                min = arr[i];
            }
        }

        System.out.print("\nThe smallest value is: " + min + ", position is " + (imin + 1) + ".");
        System.out.println();

        for(int i = 0; i < n; i++) {
            if (arr[i] < 0)
                break;

            sum += arr[i];
        }

        System.out.println("Sum of positive numbers until the negative one = " + sum);

    }
}
