package com.softserve.edu.hw.hw8.task1;

public abstract class Person {
    private FullName fullname;
    private int age;

    public Person(FullName fullName, int age){
        setAge(age);
        setFullname(fullName);
    }

    public Person(){
    }

    public FullName getFullname() {
        return fullname;
    }

    public void setFullname(FullName fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info(){
        return String.format("First name: %s, Last name: %s, Age: %d", getFullname().getFirstName(), getFullname().getLastName(), getAge());
    };

    public abstract String activity();
}
