package com.softserve.edu.hw2;

public class Person {
    //Create Console Application project in Java.
    //Add class Person to the project.
    //Class Person should consist of
    //three private fields: firstName, lastName and birthYear (the birthday year)
    //properties for access to these fields
    //default constructor and constructor with 2 parameters (first and last names)
    //methods:
    //getAge() - to calculate the age of person
    //input() - to input information about person
    //output() - to output information about person
    //changeName(String fn, String ln) - to change the first name or/and last name of person
    //
    //In the method main() create 5 objects of Person type and input information about them.

    private String firstName;
    private String lastName;
    protected int birthYear;
    private static int year = 2022;


    public Person() {
        int y1=1925;
        int y2=2021;

        firstName = "Default Name";
        lastName = "Default last Name";
        birthYear = (int) (Math.random()*(y2-y1))+y1;

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;


    }

    protected int getAge() {
        return year - birthYear;
    }

    protected String getFirstName() {
        return this.firstName;
    }

    protected String getLastName() {
        return this.lastName;
    }

    protected void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    protected void setLastName(String newLastName) {
        lastName = newLastName;

    }

    @Override
    public String toString() {
        return "Person{" +
                " firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
