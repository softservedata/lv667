package com.softserve.edu.hw5_1;

public class FlyingBird extends Bird {
    private int speedFly;
    private int flyDistance;

    public FlyingBird(int speedFly, int flyDistance, String feathers, int layEggs) {
        super(feathers, layEggs);
        setSpeedFly(speedFly);
        setFlyDistance(flyDistance);
    }


    public int getSpeedFly() {
        return speedFly;
    }

    public void setSpeedFly(int speedFly) {
        this.speedFly = validateSpeedFly(speedFly);
    }

    public int getFlyDistance() {
        return flyDistance;
    }

    public void setFlyDistance(int flyDistance) {
        this.flyDistance = validateFlyDistance(flyDistance);
    }

    public int validateSpeedFly(int speedFly) {
        if (speedFly < 0 | speedFly > 60) {
            throw new IllegalArgumentException("Birds can`t fly with this speed");
        }
        return speedFly;
    }

    public int validateFlyDistance(int flyDistance) {
        if (flyDistance < 0 | flyDistance > 100) {
            throw new IllegalArgumentException("Birds can`t fly so far ");
        }
        return flyDistance;
    }

    @Override
    String fly() {
        return " can fly";
    }



}
