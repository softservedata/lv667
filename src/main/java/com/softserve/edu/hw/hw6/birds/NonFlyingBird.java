package com.softserve.edu.hw.hw6.birds;

public class NonFlyingBird extends Bird{

    public NonFlyingBird(boolean feathers, boolean layEggs ){
        super(feathers,layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Group of birds that can't fly");
    }
}