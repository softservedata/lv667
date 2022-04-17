package com.softserve.edu.hw6.birds;

public class Eagle extends FlyingBird {

    public Eagle(boolean feathers, boolean layEggs ){
        super(feathers,layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Eagle Can fly");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers=" + isFeathers() +
                ", layEggs=" + isLayEggs() +
                '}';
    }
}
