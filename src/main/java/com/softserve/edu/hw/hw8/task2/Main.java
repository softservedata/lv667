package com.softserve.edu.hw.hw8.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Wrapper> container = new ArrayList<>();
        Collections.addAll(container,
                new Wrapper<>(Integer.valueOf(123)),
                new Wrapper<>(String.valueOf("My string")),
                new Wrapper<>(Boolean.valueOf(true))
        );

        container.forEach(obj -> {
            if(obj instanceof Wrapper){
                System.out.println("object Class:" + obj.getValue().getClass().getSimpleName() + ", object value: " + obj.getValue());
            }
        });
    }
}