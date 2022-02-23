package com.softserve.homework08.birds;

public class Swallow extends FlyingBird {
    private String name;

    public Swallow() {
        name = "Swallow";
    }

    @Override
    public void fly() {
        System.out.print(name);
        super.fly();
    }
}
