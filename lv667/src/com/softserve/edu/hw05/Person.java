package com.softserve.edu.hw05;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int    birthYear;

    //Default constructor
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.birthYear = 0;
    }

    //Constructor with parameters
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Setters and getters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int getBirthYear() {
        return birthYear;
    }

    //Methods

    //To input information about person
    public void input(){
       Scanner cin = new Scanner(System.in);

       System.out.println("Input first name: ");
       this.firstName = cin.nextLine();

       System.out.println("Input second name: ");
       this.lastName  = cin.nextLine();

        System.out.println("Input date of birth: ");
       this.birthYear = cin.nextInt();

       //Cleaning buffer
       String clean = cin.nextLine();
    }

    //To output information about person
    public void output(){
        System.out.println("\nFirst Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("Birth Year : " + birthYear + "\n");
    }

    //To get age of person
    public int getAge(int currentYear){
        return currentYear - this.birthYear;
    }
    public int getAge(){
        return 2022 - this.birthYear;
    }

    //To change name of person
    public void changeName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName  = lastName;
    }
}
