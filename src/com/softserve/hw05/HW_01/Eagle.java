package com.softserve.hw05.HW_01;

public class Eagle extends FlyingBird{

    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void print() {
        System.out.println("Eagle has " + feathers + " feathers and " + ((layEggs) ? "" : "not ") + "laying eggs");
    }

}
