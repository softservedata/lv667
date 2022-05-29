package com.softserve.edu.hw.hw6.birds;

public class FlyingBird extends Bird{

    public FlyingBird(boolean feathers, boolean layEggs ){
        super(feathers,layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Group of birds that can't fly");
    }
}