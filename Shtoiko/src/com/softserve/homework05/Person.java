package com.softserve.homework05;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

   public Person(){}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public int getAge(){
       return 2022 - birthYear;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name");
        firstName = scanner.nextLine();
        System.out.println("Enter last name");
        lastName = scanner.nextLine();
        System.out.println("Enter birth year");
        birthYear = scanner.nextInt();
    }

    public String output(){
       String message = "";
       if (firstName != null){
           message = "First name: " + firstName + "\nLast Name: " + lastName;
       }
       if (birthYear != 0){
           message += "\nBirth year: " +
                   birthYear + "\nAge: " + this.getAge();
       }
       return message;
    }

    public void changeName(String firstName, String lastName){
       this.firstName = firstName;
       this.lastName = lastName;
    }
}
