package com.softserve.edu.hw3;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        //read 3 float numbers and check: are they all belong to the range [-5,5];
        Scanner s1 = new Scanner(System.in);

        /** System.out.println("Enter float number and press <Enter>");
         float v1 = s1.nextFloat();
         System.out.println("Enter float number and press <Enter>");
         float v2 = s1.nextFloat();
         System.out.println("Enter float number and press <Enter>");
         float v3 = s1.nextFloat();

         if(v1<=5 & v1>=-5){
         System.out.println("First number belong to the range [-5,5] ");
         }else {
         System.out.println(" First number behind the range");
         }if(v2<=5 & v2>=-5){
         System.out.println("Second number belong to the range [-5,5] ");
         }else {
         System.out.println(" Second number behind the range");
         }
         if(v3<=5 & v3>=-5){
         System.out.println("Second number belong to the range [-5,5] ");
         }else {
         System.out.println(" Second number behind the range");
         }**/


        //read 3 integer numbers and write max and min of them;

        /** System.out.println("Enter number and press <Enter>");
         int v1 = s1.nextInt();
         System.out.println("Enter number and press <Enter>");
         int v2 = s1.nextInt();
         System.out.println("Enter number and press <Enter>");
         int v3 = s1.nextInt();

         int[] arr1 = {v1, v2, v3};
         int max = 0;
         int min = 0;
         for (int i = 0; i < arr1.length; i++) {

         if (arr1[0] < arr1[i]) {
         max = arr1[i];
         }else {
         max=arr1[0];
         }
         if (arr1[0] > arr1[i]) {
         min = arr1[i];
         }else {
         min=arr1[0];
         }
         }
         System.out.println("Max number is " + max);
         System.out.println("Min number is " + min);
         **/

        //read number of HTTP Error (400, 401,402, ...)
        // and write the name of this error (Declare enum HTTPError)

        HTTPError error = null;
        System.out.println("Enter a number of error end press <Enter>");
        int e1 = s1.nextInt();
        switch (e1) {
            case 400:
                error = HTTPError.HTTP_ERROR_400;
                System.out.println("It`s a " + error.toString());
                break;
            case 401:
                error = HTTPError.HTTP_ERROR_401;
                System.out.println("It`s a " + error.toString());
                break;
            case 402:
                error = HTTPError.HTTP_ERROR_402;
                System.out.println("It`s a " + error.toString());
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + e1);
        }

    }

}




