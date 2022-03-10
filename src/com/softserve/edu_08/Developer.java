package com.softserve.edu_08;

/*
Support we have a class Employee
Create a Developer class that extends the Employee class. Creates a String field and a constructor to initialize all fields in the Developer class.

Also in the Developer class, override the method report() so that it returns a string with information about the developer, for example:
Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
If necessary, modify the employee's class so that it meets the principles of encapsulation and inheritance.
Create an instance of the Employee and Developer class and print in the console information about them using report() method.
 */
public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;

    }
    @Override
    public String report(){
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f. , Position: %s",
                getName(), getAge(), getSalary(), getPosition());
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
