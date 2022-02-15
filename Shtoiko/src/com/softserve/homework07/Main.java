package com.softserve.homework07;


public class Main {
    public static void main(String[] args) {
        new Mounth();
        System.out.println( new NumbersArray().run());
        new MyArray();

        Car first = new Car(2020, 3180);
        Car second = new Car(1998, 2280);
        Car thread = new Car(2020, 1780);
        Car fourth = new Car(2020, 1480);
        Car fifth = new Car(2000, 1280);
        Car sixth = new Car(1993, 1780);
        Car.searchByYear();
        Car.orderedByYear();
    }
}