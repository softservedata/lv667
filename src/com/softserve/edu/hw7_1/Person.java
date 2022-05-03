package com.softserve.edu.hw7_1;

import com.softserve.edu.hw6.Employee;

import java.util.Comparator;
import java.util.Objects;

public abstract class Person {
    protected FullName fullName = new FullName();
    protected int age;


    public class FullName { // так як це внутрішній клас то модифікатор доступу private може бути застосований
        protected String firstName;
        protected String lastName;

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

    public Person(String firstName, String lastName, int age) {
        fullName.firstName = firstName;
        fullName.lastName = lastName;
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age > 0 & age < 100) { //можна було створити окремий метод ля валідації
            this.age = age;
        } else throw new IllegalArgumentException("Wrong age");
    }

    public String info() {
        return "First name: " + fullName.firstName + " , Last name: " + fullName.lastName + " , Age: " + age;
    }

    public abstract String activity();

    public static class AgeSort implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge() - o2.getAge();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(fullName, person.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName=" + fullName +
                ", age=" + age +
                '}';
    }

}
