package com.softserve.edu.hw.hw7.passengers;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(){
        super();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailling() {
        System.out.println("Boat is Sailling");
    }
}
