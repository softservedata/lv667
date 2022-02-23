package com.softserve.homework08.birds;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bird penguin = new Penguin();
        Bird kiwi = new Kiwi();
        Bird eagle = new Eagle();
        Bird swallow = new Swallow();

        List<Bird> birds = new ArrayList<>();
        birds.add(penguin);
        birds.add(kiwi);
        birds.add(eagle);
        birds.add(swallow);

        for (Bird bird : birds) {
            bird.fly();
        }


    }
}
