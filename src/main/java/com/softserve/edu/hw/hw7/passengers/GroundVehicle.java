package com.softserve.edu.hw.hw7.passengers;

public abstract class GroundVehicle extends Passenger implements Vehicle{

    public GroundVehicle(){
        super();
    }

    abstract void drive();
}
