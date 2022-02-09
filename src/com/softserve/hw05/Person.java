package com.softserve.hw05;


import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Person {

    private String firstName = "";; //  = null
    private String lastName = "";; //  = null
    private int birthYear = 0; //  = 0
    public static int count = 0;

    public Person() {
        count++;
    }


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        count++;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        count++;
    }

    public int getAge(){
        return 2022 - birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    static Person input() {
        Scanner scan = new Scanner(System.in);
        Person p = new Person();
        System.out.print("First name: ");
        p.setFirstName(scan.next());
        System.out.print("Last name: ");
        p.setLastName(scan.next());
        System.out.print("Birth year: ");
        p.setBirthYear(scan.nextInt());
        return p;
    }

    public String output() {
        return "Person{FirstName: " + firstName + ", LastName: " + lastName + ", BirthYear: " + birthYear +
                ", Age: " + getAge();
    }

    void changeName(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }


}

class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        for (int i = 0; i < 5; i++) {
            people[i] = Person.input();
        }

        for (Person person : people) {
            System.out.println(person.output());
        }
    }
}
