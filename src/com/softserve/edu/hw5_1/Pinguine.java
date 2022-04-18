package com.softserve.edu.hw5_1;

public class Pinguine extends NonFlyingBird {
    public Pinguine(int speedGo, int goDistance, String feathers, int layEggs) {
        super(speedGo, goDistance, feathers, layEggs);
    }

    @Override
    public String toString() {
        return "{class Pinguine: " +
                "speedGo= " + getSpeedGo()+ ", goDistance= " + getGoDistance() + ", feathers= " + getFeathers()+ ", layEggs= " + getLayEggs()+"}";


    }
}
