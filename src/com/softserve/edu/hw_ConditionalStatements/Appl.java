package com.softserve.edu.hw_ConditionalStatements;

import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int select;

        while (true) {
            System.out.println("\n[1] Task 1");
            System.out.println("[2] Task 2");
            System.out.println("[0] Exit");

            System.out.print("\nInput :");
            select = Integer.parseInt(cin.nextLine());

            if (select == 1) Task1();
            else if (select == 2) Task2();
            else if (select == 0) break;

            else System.out.println("\nInput is incorrect");

        }
    }

    public static void Task1(){
        Scanner cin = new Scanner(System.in);
        boolean isInRande = true;
        boolean httpNotExist = true;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int HTTP;

        System.out.println("\nZZZZZZZZZZ TASK_1 ZZZZZZZZZZ\n");

        //First subtask
        System.out.println("Input three float numbers");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + ": ");
            double temp = Double.parseDouble(cin.nextLine());

            if(temp < -5.0 || temp > 5.0) isInRande = false;
        }

        //Second subtask
        System.out.println("\nInput three int numbers");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + ": ");
            int temp = Integer.parseInt(cin.nextLine());

            if (temp > max) max = temp;
            if (temp < min) min = temp;
        }

        //Third subtask
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nInput HTTP error number: HTTP-");
        HTTP = Integer.parseInt(scanner.nextLine());

        //result
        System.out.println("\nZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");

        System.out.println("\n3 float numbers belong to [-5;5]: " + isInRande);
        System.out.println("\nmax - " + max + " min - " + min + " of 3 int numbers\n");

        for (httpError code: httpError.values()){
            if(code.getNumber() == HTTP){
                code.getInfo();
                httpNotExist = false;
            }
        }

        if(httpNotExist){
            System.out.println("HTTP code doesn't exist");
        }

        System.out.println("\nZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
    }

    public static void Task2(){

        System.out.println("\nZZZZZZZZZZ TASK_2 ZZZZZZZZZZ\n");

        Dog Spyke = new Dog("Spyke", Breed.Boxer   , 4);
        Dog Back  = new Dog("Spyke" , Breed.Bulldog , 9);
        Dog Chop  = new Dog("Chop" , Breed.Komondor, 6);

        if(Spyke.getName() == Back.getName() || Back.getName() == Chop.getName() || Spyke.getName() == Chop.getName()){
            System.out.println("There are dogs with same name\n");
        }

        if(Spyke.getAge() < Back.getAge()){
            if (Spyke.getAge() < Chop.getAge()) Spyke.getInfo();
        }

        if(Back.getAge() < Chop.getAge()) {
            if(Back.getAge() < Spyke.getAge()) Back.getInfo();
        }

        if(Chop.getAge() < Spyke.getAge()){
            if(Chop.getAge() < Back.getAge()) Chop.getInfo();
        }
    }

}
