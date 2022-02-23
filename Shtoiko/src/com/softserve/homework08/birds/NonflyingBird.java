package com.softserve.homework08.birds;

public abstract class NonflyingBird extends Bird {

    @Override
    public void fly() {
        System.out.println(" does not flying");
    }
}
