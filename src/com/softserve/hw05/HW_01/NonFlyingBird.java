package com.softserve.hw05.HW_01;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
public void print (){

}

    public void fly() {
        System.out.println("This bird can not fly");
    }
}
