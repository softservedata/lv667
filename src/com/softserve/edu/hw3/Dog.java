package com.softserve.edu.hw3;

import java.util.Objects;

public class Dog {
    //Сreate class Dog with fields name, breed, age.
    //Declare enum for field breed.
    //Create 3 instances of type Dog.
    //Check if there is no two dogs with the same name.
    //Display the name and the kind of the oldest dog.
    public String name;
    public Enum breed;
    public int age;

    public Dog(String name, Enum breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public Enum getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }


    enum Enum {
        BOXER, CORGI, DOBERMAN
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                '}';
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Adolf", Enum.BOXER, 45);
        Dog dog2 = new Dog("Pes", Enum.CORGI, 7);
        Dog dog3 = new Dog("Ivan", Enum.DOBERMAN, 1);
        Dog dog4 = new Dog("Ivan", Enum.BOXER, 10);

        Object[] dogs = {dog1, dog2, dog3, dog4};

        for (int i = 0; i < dogs.length - 1; i++) {
            if (dogs[i].equals(dogs[i + 1])) {
                System.out.println("This dogs have the same name " + dogs[i].toString() + " " + dogs[i + 1]);

            }

        }

        int[] age = {dog1.age, dog2.age, dog3.age, dog4.age};
        int maxAge = age[0];
        for (int i = 1; i < age.length - 1; i++) {
            if (age[i] > maxAge) {
                maxAge = age[i];
            }


        }

        switch (maxAge) {
            case 45:
                System.out.println("This dog is an oldest " + dog1);
                break;
            case 7:
                System.out.println("This dog is an oldest " + dog2);
                break;
            case 1:
                System.out.println("This dog is an oldest " + dog3);
                break;
            case 10:
                System.out.println("This dog is an oldest " + dog4);
                break;
        }
    }


}
