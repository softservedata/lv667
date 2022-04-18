package com.softserve.edu.hw5_1;

public class Swallow extends FlyingBird {


    private double wingspan;

    public Swallow(double wingspan, int speedFly, int flyDistance, String feathers, int layEggs) {
        super(speedFly, flyDistance, feathers, layEggs);
        setWingspan(wingspan);
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = validateWingspan(wingspan);
    }

    public double validateWingspan(double wingspan){
        if(wingspan<0 | wingspan>5){
            throw new IllegalArgumentException("Wingspan must be in the range from 0.1 to 5");
        }
        return wingspan;
    }



    @Override
    public String toString() {
        return "{class Swallow: " +
                "wingspan=" + wingspan +", speedFly= " + getSpeedFly() + ", flyDistance= " + getFlyDistance() + ", feathers= " + getFeathers()+ ", layEggs= " + getLayEggs()+"}"+"\n";

    }
}

