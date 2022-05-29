package com.softserve.edu.hw.hw6.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Collections.addAll(list,
                new Employee("Ivan", 25, 1500.0),
                new Employee("Hanna", 25, 1500.0),
                new Employee("Julia", 25, 1500.0),
                new Developer("Lubomir", 22, 1200.0, "QA"),
                new Developer("Edgar", 45, 6000.0, "Senior Java Developer"),
                new Developer("Taras", 51, 5500.0, "Project Manager"),
                new Developer("Michael", 35, 6500.0, "DevOps"));
        list.forEach(human -> {
            System.out.println(human.report());
        });
    }
}
