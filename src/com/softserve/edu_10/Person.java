package com.softserve.edu_10;

public abstract class Person extends FullName{
    FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        super(fullName.getFirstName(),fullName.getLastName());
        this.setFirstName(fullName.getFirstName());
        this.setFirstName(fullName.getLastName());
        this.age = age;
    }

    public String info(){
        return " First name: " + getFirstName() + ", Last name: " + getLastName() + ", Age: " + age;
    }
    public abstract String activity();

}
