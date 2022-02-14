package com.softserve.edu_06;
//Solve the next tasks:
//        read 3 float numbers and check: are they all belong to the range [-5,5];
//        read 3 integer numbers and write max and min of them;
//        read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
//Сreate class Dog with fields name, breed, age.
//        //Declare enum for field breed.
//        //Create 3 instances of type Dog.
//        Check if there is no two dogs with the same name.
//Display the name and the kind of the oldest dog.
public class Dog {
    private String dog;
    public static Dog name = new Dog("name");
    public static Dog breed = new Dog("breed");
    public static Dog age = new Dog("age");
    private Dog(String dog) { this.dog = dog; }
}
