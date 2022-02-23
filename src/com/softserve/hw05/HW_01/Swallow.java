package com.softserve.hw05.HW_01;

public class Swallow extends FlyingBird {

    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
@Override
    public void print() {
        System.out.println("Swallow has " + feathers + " feathers and " + ((layEggs) ? "" : "not ") + "laying eggs");
    }
}

