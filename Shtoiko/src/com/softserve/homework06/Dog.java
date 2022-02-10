package com.softserve.homework06;

import java.util.*;

enum Breed {
    LABRADOR, MALINOIS, BULLDOGS, HUSKIES, MASTIFF
}

public class Dog {
    private static ArrayList<Dog> dogs = new ArrayList<>(5);
    private final String name;
    private final Breed breed;
    private final int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        dogs.add(this);
    }

    public static Dog getOldestDog() {
        Collections.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                if (o1.getAge() == o2.getAge()) {
                    return 0;
                }
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                }
                return -1;
            }
        });
        return dogs.get(dogs.size() - 1);
    }

    public static String identicalNames() {
        Set<String> names = new TreeSet<>();
        for (Dog element : dogs) {
            names.add(element.getName());
        }
        return "Quantity of identical names is " + (dogs.size() - names.size());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return getAge() == dog.getAge() && getName().equals(dog.getName()) && getBreed() == dog.getBreed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBreed(), getAge());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                "}";
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}
