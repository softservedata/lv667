package com.softserve.hw.hw8.task1;

public class FullName {
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    };

    public FullName(){

    };

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
