package com.softserve.homework05;

public class Main {
    public static void main(String[] args) {

        Person first = new Person();
        first.input();
        System.out.println(first.output());
        Person second = new Person("Igor", "Shevchenko", 1990);
        System.out.println(second.output());
        Person third = new Person("Andryi", "Terasenko");
        Person fourth = new Person("Oleg", "Onykienko");
        System.out.println(fourth.output());
        Person fifth = new Person("Taras", "Uhimenko", 1995);
    }
}