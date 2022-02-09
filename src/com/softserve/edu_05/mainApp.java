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
public class mainApp {
    public static void main(String[] args) {
        Person p1 = new Person("Mikola", "Lozynskyi");
        Person p2 = new Person("Frank", "Illai");
        Person p3 = new Person("Min", "Lutr");
        Person p4 = new Person("Qerid", "Partan");
        Person p5 = new Person("Waser", "Neo");
        p1.input(2001);
        p2.input(2002);
        p3.input(2003);
        p4.input(2004);
        p5.input(2005);
        p1.output();
        p2.output();
        p3.output();
        p4.output();
        p5.output();
        p1.changeName("Mikolaa");
        p1.changelastName("gok");
        p1.changeBirthYear(2000);
        p1.output();
    }
}
