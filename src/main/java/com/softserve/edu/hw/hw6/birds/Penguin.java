package com.softserve.edu.hw.hw6.birds;

public class Penguin extends NonFlyingBird{

    public Penguin(boolean feathers, boolean layEggs ){
        super(feathers,layEggs);
    }

    @Override
    public void fly() {
            System.out.println("Penguin Can't fly");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers=" + isFeathers() +
                ", layEggs=" + isLayEggs() +
                '}';
    }
}
