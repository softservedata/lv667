package com.softserve.edu_05;
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
public class Person {
    //fields
    private String firstName;
    private String lastName;
    private int birthYear;
    //constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person (){
    }
    //method
    public int getAge(int birthYear){
        return 2022 - this.birthYear;

    }
    public void input(int birthYear){
        this.birthYear = birthYear;
    }
    public void output(){
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.birthYear);
    }
    public void changeName(String firstName) {
        this.firstName = firstName;
    }
    public void changelastName(String lastName) {
        this.lastName = lastName;
    }
    public void changeBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
