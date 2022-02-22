package com.softserve.homework08;

public class Deweloper extends Employee{
    private String position;

    public Deweloper(String name, int age, double salary, String position){
        super(name, age, salary);
        this.position = position;
    }

    public String report(){
        return super.report() + " Positon: " + position;
    }
}
