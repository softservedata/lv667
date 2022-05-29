package com.softserve.edu.hw.hw7.passengers;

public abstract class FlyingVehicle extends Passenger implements Vehicle{

    public FlyingVehicle(){
        super();
    }

    abstract void fly();
    abstract void land();
}
