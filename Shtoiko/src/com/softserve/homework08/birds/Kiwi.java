package com.softserve.homework08.birds;

public class Kiwi extends NonflyingBird {
    private String name;

    public Kiwi() {
        name = "Kiwi";
    }

    @Override
    public void fly() {
        System.out.print(name);
        super.fly();
    }
}
