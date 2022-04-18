package com.softserve.edu.hw_OOP_2.Task_2;

public class Helicopter extends FlyingVehicle{
    private int Weight;
    private int MaxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        Weight = weight;
        MaxHeight = maxHeight;
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void land() {
        super.land();
    }
}
