package com.softserve.hw.hw6.birds;

public class Kiwi extends NonFlyingBird{

    public Kiwi(boolean feathers, boolean layEggs ){
        super(feathers,layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Kiwi Can't fly");
    }

    @Override
    public String toString() {
        return "Kiwi{" +
                "feathers=" + isFeathers() +
                ", layEggs=" + isLayEggs() +
                '}';
    }
}
