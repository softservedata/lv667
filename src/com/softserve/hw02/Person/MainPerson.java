package com.softserve.hw02.Person;

public class MainPerson {
    public static void main(String[] args) {
        Person personOne = new Person();
        Person personTwo = new Person();
        Person personThree = new Person();
        Person personFour = new Person();
        Person personFive = new Person();
        Person[] people = {personOne, personTwo, personThree, personFour, personFive};
        for (Person p : people) {
            p.input();
        }
        for (Person p : people) {
            p.output();
        }
        personOne.changeName("Diana", "Kiv");
        personOne.output();
    }
}
