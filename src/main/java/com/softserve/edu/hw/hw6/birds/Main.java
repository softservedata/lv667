package com.softserve.edu.hw.hw6.birds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Bird> birdList = new ArrayList<>();
        Collections.addAll(birdList,
                new Eagle(true, true),
                new Eagle(true, true),
                new Eagle(true, true),
                new Penguin(false, false),
                new Penguin(false, false),
                new Penguin(false, false),
                new Kiwi(true,false),
                new Kiwi(true,false),
                new Kiwi(true,false),
                new Swallow(true,true),
                new Swallow(true,true),
                new Swallow(true,true));

        System.out.println("the size of a birdList : " + birdList.size());
        System.out.println("invoke fly() method of every element in collection :");
        birdList.forEach(entity -> {
            if(entity instanceof Bird){
                entity.fly();
            }
        });

        System.out.println("--------------------------------------------------------");
        System.out.println("invoke toString() method of every element in collection : ");
        birdList.forEach(entity -> {
            if(entity instanceof Bird){
                System.out.println(entity.toString());
            }
        });
    }
}
