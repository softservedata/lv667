package com.softserve.edu.hw5;

public class Main {
    public static void main (String[] args) {
        Person objPerson = new Person();
        Person infoPerson = new Person(objPerson.input("Enter firstname:"), objPerson.input("Enter lastname:"), objPerson.inputInteger("Enter birthday year:"));
        infoPerson.output();
        infoPerson.getAge();
        infoPerson.changeName("New_first_name", "New_last_name");
        infoPerson.output();
        infoPerson.changeName("???");
        infoPerson.output();
    }
}
