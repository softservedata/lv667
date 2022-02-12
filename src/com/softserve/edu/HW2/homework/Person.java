package com.softserve.edu.HW2.homework;

import java.time.Year;
import java.util.Scanner;

public class Person {

    private String firstName;
    private String secondName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Person(){
       firstName = "John";
       secondName = "Connor";
       birthYear = 1985;
    }

    public Person(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public int getAge(){
        int year = Year.now().getValue();
        return year - birthYear;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter FirstName:");
        firstName = sc.nextLine();
        System.out.print("Enter SecondName:");
        secondName = sc.nextLine();
        System.out.println("Enter Age:");
        birthYear = sc.nextInt();
        sc.close();
    }
    public void output(){
        System.out.println("FirstName:" + firstName +"\nSecondName:" + secondName + "\nBirthYear:" + birthYear + "\nAge:" + getAge());
    }
    public void changeFirstName(String firstName){
        this.firstName = firstName;
    }
    public void changeName(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }
}
