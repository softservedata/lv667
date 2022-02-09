package com.softserve.hw02.Student;

public class Student {
    private String name;
    private int rating;
    public static double avgRating;

    public Student() {
        name = "Roman";
        rating = 4;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int rating) {
        this.rating = rating;
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean betterStudent(Student first, Student second) {
        return first.rating > second.rating;
    }

    @Override
    public String toString() {
        return "Student \r\nName: " + name + ", Rating: " + rating;
    }
}
