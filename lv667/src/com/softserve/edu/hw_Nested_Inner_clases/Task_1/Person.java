package com.softserve.edu.hw_Nested_Inner_clases.Task_1;

public abstract class Person{
    private int age;
    private FullName fullName;

    public Person(int age, FullName fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public void info(){
        String format = String.format("First name: %s, Last name: %s, Age: %d",
                fullName.getFirstName(), fullName.getLastName(), age);
        System.out.println(format);
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String activity();
}
