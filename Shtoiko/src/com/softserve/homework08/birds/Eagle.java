package com.softserve.homework08.birds;

public class Eagle extends FlyingBird {
    private String name;

    public Eagle() {
        name = "Eagle";
    }

    @Override
    public void fly() {
        System.out.print(name);
        super.fly();
    }
}
