package com.softserve.homework05.practical;

public class Main {
    public static void main(String[] args) {
        Employee first = new Employee();
            first.setName("Igor");
            first.changeRate(20);
            first.setHours(44);

        Employee second = new Employee("Andryi", 23);
            second.setHours(37);

        Employee third = new Employee("David", 25, 40);

        for (Employee employee : Employee.getEmployeeList())
            System.out.println(employee);
        System.out.println("Total salary: " + Employee.getTotalSum());
    }
}
