package com.softserve.hw.hm3;

public class Main {
    public static void main(String[] args) {

        // Create an instance of the Person class
        Person p1 = new Person();
        p1.input();
        p1.output();
        p1.changeName("Oleg");
        p1.output();
        p1.changeName("Batman", "Origin");
        p1.output();
    }
}
