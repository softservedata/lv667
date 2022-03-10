package com.softserve.edu_08;
/*
If necessary, modify the employee's class so that it meets the principles of encapsulation and inheritance.
Create an instance of the Employee and Developer class and print in the console information about them using report() method.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Mikola", 20, 3000000);
        Developer developer = new Developer("Taras", 32, 30000, "Average Java developer");
        System.out.println(developer.report());
        System.out.println(employee.report());
    }
}
