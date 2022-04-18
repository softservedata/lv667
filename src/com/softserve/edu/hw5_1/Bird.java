package com.softserve.edu.hw5_1;

public abstract class Bird {
    private String feathers;
    private int layEggs;

    public Bird(String feathers,int layEggs){
        setFeathers(feathers);
        setLayEggs(layEggs);
    }

    abstract String fly();


    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        if(feathers=="low")  {
            this.feathers = feathers;
        }else if(feathers=="middle"){
            this.feathers = feathers;
        }else if(feathers=="hight"){
            this.feathers = feathers;
        }else throw new IllegalArgumentException("Wrong type of feathers");

    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        if(layEggs<0 | layEggs>10){
            throw new IllegalArgumentException("Birds can`t lay so much or not enought eggs ");
        }
        this.layEggs = layEggs;
    }


}

