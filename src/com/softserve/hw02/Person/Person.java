package com.softserve.hw02.Person;

import java.util.Calendar;
import java.util.Scanner;


public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private final Scanner sc = new Scanner(System.in);

    public Person() {
        firstName = "Jerry";
        lastName = "Darvin";
        birthYear = 1999;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - birthYear;

    }

    public void input() {
        System.out.println("Please, enter firstname:");
        firstName = sc.nextLine();
        System.out.println("And lastname:");
        lastName = sc.nextLine();
        System.out.println("And BirthYear:");
        birthYear = sc.nextInt();
    }

    public void output() {
        System.out.println("Firstname: " + firstName + ", Lastname: " + lastName
                + ", BirthYear: " + birthYear + ", Age: " + getAge());
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void changeName(String firstName) {
        this.firstName = firstName;
    }
}
