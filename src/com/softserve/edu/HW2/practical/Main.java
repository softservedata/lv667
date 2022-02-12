package com.softserve.edu.HW2.practical;


public class Main {
    public static void main(String[] args) {
        Employee firstEmp = new Employee("Tim",6, 10);
        Employee secondEmp = new Employee("Gito",9, 12);
        Employee thirdEmp = new Employee("Pito", 7, 8);
        firstEmp.toString();
        secondEmp.toString();
        thirdEmp.toString();
        Employee[] employees = {firstEmp, secondEmp, thirdEmp};
        for (Employee emp : employees) {
            Employee.totalSum += emp.getSalary(emp.getRate(), emp.getHours());
        }
        System.out.println("Total Salary:" + Employee.totalSum);
    }
}
