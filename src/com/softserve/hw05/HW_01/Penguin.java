package com.softserve.hw05.HW_01;

public class Penguin extends NonFlyingBird {

    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void print() {
        System.out.println("Penguin has " + feathers + " feathers and " + ((layEggs) ? "" : "not ") + "laying eggs");
    }

}
