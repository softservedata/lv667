package com.softserve.edu.hw7.passengers;

import com.softserve.edu.hw7.passengers.WaterVehicle;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(){
        super();
    }

    public int getFloors() {return floors;}
    public void setFloors(int floors) {this.floors = floors;}

    @Override
    void isSailling() {
        System.out.println("Liner is Sailling");
    }
}
