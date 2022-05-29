package com.softserve.edu.hw.hw7.passengers;

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
