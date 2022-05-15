package com.softserve.edu.hw_ConditionalStatements;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name  = name;
        this.breed = String.valueOf(breed);
        this.age   = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo(){
        System.out.println(this.name + "  - the youngest Dog");
        System.out.println("Name  - " + name );
        System.out.println("Breed - " + breed);
        System.out.println("Age   - " + age  );
    }
}
