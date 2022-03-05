package com.softserve.edu_08;

public class FlyingBirds extends Bird {
    public FlyingBirds(String attributes, String feathers, String layEggs) {
        super(attributes, feathers, layEggs);
    }

    public boolean fly() {
        return true;
    }
}
