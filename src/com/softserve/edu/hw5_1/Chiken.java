package com.softserve.edu.hw5_1;

public class Chiken extends NonFlyingBird{
    public Chiken(int speedGo, int goDistance, String feathers, int layEggs) {
        super(speedGo, goDistance, feathers, layEggs);
    }

    @Override
    public String toString() {
        return "{class Chiken: "+
                "speedGo= " + getSpeedGo() + ", goDistance= " + getGoDistance() + ", feathers= " + getFeathers()+ ", layEggs= " + getLayEggs()+"}"+"\n";


    }
}
