package com.softserve.hw03.HW;

import java.util.Scanner;

public class MainDog {
    public static void main(String[] args) {
        int maxOldestDog = 0;
        Dog oldestDog = null;
        boolean duplicates = false;
        String duplicateName = null;
        Scanner sc = new Scanner(System.in);
        Dog dogOne = new Dog("Bob", Breed.BOXER, 14);
        Dog dogTwo = new Dog("Lucky", Breed.DALMATIAN, 7);
        Dog dogTree = new Dog("Bob", Breed.PUG, 2);
        Dog[] dogs = {dogOne, dogTwo, dogTree};
        for (int i = 0; i < dogs.length; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].getName() == dogs[j].getName()) {
                    duplicateName = dogs[i].getName();
                    duplicates = true;
                }
            }
        }
//        if (duplicates) {
//            System.out.println("Dogs have the same name");
//        } else {
//            System.out.println("Dogs not have the same name");
//        }
        System.out.println((duplicates) ? "Dogs have the same name: " + duplicateName : "Dogs not have the same name");
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i].getAge() > maxOldestDog) {
                maxOldestDog = dogs[i].getAge();
                oldestDog = dogs[i];
            }
        }
        System.out.println("\n\rOldest " + oldestDog);
    }
}

enum Breed {
    BEAGLE("Beagle"), BOXER("Boxer"),
    DALMATIAN("Dalmatian"), PUG("Pug");
    private String name;

    Breed(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}