package com.softserve.edu.hw5;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName, lastName;
    private int birthYear;

    public Person() {}

    public Person (String firstname, String lastname, int birthday) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.birthYear = birthday;
    }

    public String input(String requestText) {
        Scanner currentValue = new Scanner(System.in);
        System.out.println(requestText);
        return currentValue.nextLine();
    }

    public int inputInteger(String requestText) {
        Scanner currentValue = new Scanner(System.in);
        System.out.println(requestText);
        return currentValue.nextInt();
    }

    public void output() {
        System.out.println("First name: " + this.firstName );
        System.out.println("Last name: " + this.lastName );
        System.out.println("The birthday year: " + this.birthYear );
    }

    public void getAge() {
        LocalDate currentYear = LocalDate.now();
        System.out.println("Age of person: " + (currentYear.getYear()-this.birthYear));
    }
    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
    public void changeName(String fn) {
        this.firstName = fn;
    }
}
