package com.softserve.homework08.birds;

public class Penguin extends NonflyingBird {
    private String name;

    public Penguin() {
        name = "Penguin";
    }

    @Override
    public void fly() {
        System.out.print(name);
        super.fly();
    }
}

