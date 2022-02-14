package com.softserve.edu_06;


import java.util.Scanner;

//Solve the next tasks:
//        read 3 float numbers and check: are they all belong to the range [-5,5];
//        read 3 integer numbers and write max and min of them;
public class NumbersApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 3 numbers");
        checkNumber(Float.parseFloat(scanner.nextLine()));
        checkNumber(Float.parseFloat(scanner.nextLine()));
        checkNumber(Float.parseFloat(scanner.nextLine()));
        System.out.println("Write 3 numbers");
        maxminNumbers(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
    }
    static void checkNumber(float z){
        if (z >= -5 && z <= 5){
            System.out.println("Your number is in range");
        }else {
            System.out.println("Your number is not in range");
        }
    }
    static void maxminNumbers(int r, int t, int j){
        if ( r > t && r > j ){
            System.out.println("max value " + r);
        }
        if ( t > r && t > j ){
            System.out.println("max value " + t);
        }
        if ( j > r && j > t ){
            System.out.println("max value " + j);
        }
        if ( r < t && r < j ){
            System.out.println("min value " + r);
        }
        if ( t < r && t < j ){
            System.out.println("min value " + t);
        }
        if ( j < r && j < t ){
            System.out.println("min value " + j);
        }
    }
}

