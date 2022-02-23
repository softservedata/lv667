package com.softserve.hw05.HW_01;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public void print() {

    }

    public void fly() {
        System.out.println("This bird can fly");

    }
}
