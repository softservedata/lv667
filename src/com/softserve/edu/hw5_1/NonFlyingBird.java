package com.softserve.edu.hw5_1;

public class NonFlyingBird extends Bird {

    private int speedGo;
    private int goDistance;

    public NonFlyingBird(int speedGo, int goDistance, String feathers, int layEggs) {
        super(feathers, layEggs);
        setSpeedGo(speedGo);
        setGoDistance(goDistance);

    }

    public int getSpeedGo() {
        return speedGo;
    }

    public void setSpeedGo(int speedGo) {

        this.speedGo = validateSpeedGo(speedGo);
    }

    public int getGoDistance() {
        return goDistance;
    }

    public void setGoDistance(int goDistance) {

        this.goDistance = validateGoDistance(goDistance);
    }

    public int validateSpeedGo(int speedGo) {
        if (speedGo < 0 | speedGo > 20) {
            throw new IllegalArgumentException("Birds can`t go with this speed");
        }
        return speedGo;
    }

    public int validateGoDistance(int goDistance) {
        if (goDistance < 0 | goDistance > 35) {
            throw new IllegalArgumentException("Birds can`t go so big distances");
        }
        return goDistance;
    }


    @Override
    String fly() {
        return " can`t fly";
    }


}
