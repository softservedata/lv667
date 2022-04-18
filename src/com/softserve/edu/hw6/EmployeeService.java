package com.softserve.edu.hw6;

import java.util.Arrays;


public class EmployeeService {
    private final static Employee[] ARRAY_EMPLOYEE = new Employee[]{
            new SalariedEmployee("first", "one", 100, 168),
            new SalariedEmployee("second", "two", 75, 160),
            new ContractEmployee("third", "id1", 46000),
            new ContractEmployee("quarter", "id2", 9000)
    };

    public void run() {
        System.out.println("Before sort");
        print(ARRAY_EMPLOYEE);

        Arrays.sort(ARRAY_EMPLOYEE, new Employee.SalarySort());
        System.out.println("________________________________");
        System.out.println("After sort");
        print(ARRAY_EMPLOYEE);

    }

    private void print(Object[] array) {
        for (Object obj : array) {
            System.out.println(obj);
        }
    }

}
