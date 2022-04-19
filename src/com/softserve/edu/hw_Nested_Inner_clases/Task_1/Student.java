package com.softserve.edu.hw_Nested_Inner_clases.Task_1;

public class Student extends Person {
    private int course;

    public Student(int age, FullName fullName, int course) {
        super(age, fullName);
        this.course = course;
    }

    @Override
    public void info() {
        String format = String.format("\nFirst name: %s, Last name: %s, Age: %d, course: %s",
                super.getFullName().getFirstName(), super.getFullName().getLastName(), super.getAge(), this.course);
        System.out.println(format);
    }

    @Override
    public String activity() {
        return "I study at university\n";
    }
}
