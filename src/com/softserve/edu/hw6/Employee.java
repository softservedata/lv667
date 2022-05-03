package com.softserve.edu.hw6;

//Create Payment interface with the method calculatePay(), the base class Employee with a string variable employeeld.
//Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class.
//Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child).
//Describe the string variable socialSecurityNumber in the class SalariedEmployee .
//Include a description of federalTaxIdmember in the class of ContractEmployee.
//The calculation formula for the "time-worker“ is: the average monthly salary = hourly rate * number of hours worked
//For employees with a fixed payment the formula is: the average monthly 	salary = fixed monthly payment
//Create an array of employees and add the employees with different form of payment.
//Arrange the entire sequence of workers descending the average monthly wage.
// Output the employee ID, name, and the average monthly wage for all elements of the list.

import java.util.Comparator;

public abstract class Employee implements Payment{
    protected String employeeId;
    protected int salary;

    public int getSalary() {
        return salary;
    }

    public Employee() {
    }

    public Employee(String employeeId) {
        setEmployeeId(employeeId);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = validateEmployeeId(employeeId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String validateEmployeeId(String employeeId) {

        switch (employeeId) {
            case "first":
                return employeeId;
            case "second":
                return employeeId;
            case "third":
                return employeeId;
            case "quarter":
                return employeeId;
            case "five":
                return employeeId;
            default: {
                throw new IllegalArgumentException("For this example we can use only employeeId from range of [1;5] ");
            }


        }

    }

    public static class SalarySort implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getSalary()- o2.getSalary();
        }
    }

}
