package com.softserve.edu.hw_OOP_2.Task_2;

public class Appl {
    public static void main(String[] args) {
        Liner      liner      = new Liner     (4000,               5);
        Boat       boat       = new Boat      (4,                 12);
        Plane      plane      = new Plane     (300,           10_000               );
        Helicopter helicopter = new Helicopter(13,                2700,   5000);
        Bus        bus        = new Bus       (40,                 "3A"                 );
        Motorcycle motorcycle = new Motorcycle(2,              300);
        Car        car        = new Car       (4,                 "X5");
    }
}
