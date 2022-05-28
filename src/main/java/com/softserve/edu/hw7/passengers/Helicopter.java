package com.softserve.edu.hw7.passengers;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(){

    }

    @Override
    void fly() {
        System.out.println("Helicopter is flying");
    }

    @Override
    void land() {
        System.out.println("Helicopter is landing");
    }
}
