package com.softserve.edu.hw7_1;

public class Student extends Person {
    private int course;


    public Student(String firstName, String lastName, int age, int course) {
        super(firstName, lastName, age);
        setCourse(course);
    }


    public void setCourse(int course) {
        if (course >= 1 & course <= 6) {
            this.course = course;
        } else throw new IllegalArgumentException("Wrong course");

    }

    @Override
    public String activity() {
        return "I LOVE STUDY IN MY UNIVERSITY !!!";
    }

    @Override
    public String info() {
        return "First name: " + fullName.firstName + " , Last name: " + fullName.lastName + " , Age: " + age + " , Course: " + course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName=" + fullName.firstName +" "+ fullName.lastName+
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}
