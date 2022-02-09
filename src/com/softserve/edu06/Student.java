package com.softserve.edu06;

import java.util.Objects;

// POJO; Entity; Bean
public class Student { // extends Object
    private String name;
    private int age;

    public Student() {
        name = "";
        age = -1;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /*-
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        Student other = (Student) obj;
        if ((age != other.age)
                || ((name == null) && (other.name != null))
                || ((name != null) && (other.name == null))) {
            return false;
        }
        if ((name == null) && (other.name == null)) {
            return true;
        }
        return name.equals(other.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name +
                ", age=" + age +
                '}';
    }
}
