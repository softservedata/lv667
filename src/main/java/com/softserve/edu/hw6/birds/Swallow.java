package com.softserve.edu.hw6.birds;

public class Swallow extends FlyingBird{

    public Swallow(boolean feathers, boolean layEggs ){
        super(feathers,layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Swallow Can fly");
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers=" + isFeathers() +
                ", layEggs=" + isLayEggs() +
                '}';
    }

}
