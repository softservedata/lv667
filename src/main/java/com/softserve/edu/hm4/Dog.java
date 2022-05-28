package com.softserve.edu.hm4;

public class Dog {

    private Breed breed;
    private String name;
    private int age;

    // Getters - Setters
    public Breed getBreed() {return breed;}
    public String getName() {return name;}
    public int getAge() {return age;}
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setBreed(Breed input){this.breed=input;}

    // Constructor
    public Dog(String name, int age, Breed breed){
        setAge(age);
        setName(name);
        setBreed(breed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;

        Dog dog = (Dog) o;

        if (getAge() != dog.getAge()) return false;
        if (getBreed() != dog.getBreed()) return false;
        return getName() != null ? getName().equals(dog.getName()) : dog.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getBreed() != null ? getBreed().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed=" + breed +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
