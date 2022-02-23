package com.softserve.hw05.HW_01;

public class Chicken extends NonFlyingBird {

    public Chicken(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void print() {
        System.out.println("Chicken has " + feathers + " feathers and " + ((layEggs) ? "" : "not ") + "laying eggs");
    }

}
