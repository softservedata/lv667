package com.softserve.edu_10;

public class Student extends Person{
    public int idCourse;

    public Student(FullName fullName, int age, int idCourse) {
        super(fullName, age);
        this.idCourse = idCourse;

    }

    @Override
    public String activity() {
        return "Studying:";
    }
    @Override
    public String info() {
        return " First name: " + getFirstName() + ", Last name: " + getLastName() + ", Age: " + age + " Studying in: " + idCourse;
    }

}
