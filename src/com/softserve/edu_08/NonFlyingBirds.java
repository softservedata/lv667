package com.softserve.edu_08;

public class NonFlyingBirds extends Bird {
    public NonFlyingBirds(String attributes, String feathers, String layEggs) {
        super(attributes, feathers, layEggs);
    }

    public boolean fly() {
        return false;
    }
}
