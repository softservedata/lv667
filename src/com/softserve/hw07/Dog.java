package com.softserve.hw07;

public class Dog {

    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setDogName(String name) {
        this.name = name;
    }

    public void setDogAge(int age) {
        this.age = age;
    }

    public int computeDogAge() {
        this.age = age * 7;
        return age;

    }

    public String toString() {
        String dogsname = "Dog's name: ";
        String dogsage = "Dog's age: ";
        return dogsname + name + "\t" +

                dogsage + age;

    }

    public static void main(String[] args) {

        Dog dog1 = new Dog(1, "Lucky");
        Dog dog2 = new Dog(2, "Starc");
        Dog dog3 = new Dog(5, "Lutchy");

        dog1.setDogAge(9);
        System.out.println(dog1);

        dog2.setDogName("Azzam");
        System.out.println(dog2);

        System.out.println(dog3);


        System.out.println();

        System.out.println("Dog's ages in person + years:");

        System.out.println(dog1.computeDogAge());
        System.out.println(dog2.computeDogAge());
        System.out.println(dog3.computeDogAge());
    }
}

