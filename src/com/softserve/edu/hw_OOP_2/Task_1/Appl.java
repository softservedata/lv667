package com.softserve.edu.hw_OOP_2.Task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Appl {
    public static void main(String[] args) {
        Employee[] workers = new Employee[10];

        workers[0] = new SalariedEmployee("10458201", "493567", 1500, 400, true);
        workers[1] = new ContractEmployee("10458202",  "9463", 28, 52);
        workers[2] = new SalariedEmployee("10458203", "493568", 700, 200, true);
        workers[3] = new ContractEmployee("10458204",  "9464", 32, 45);
        workers[4] = new SalariedEmployee("10458205", "493569", 900, 300, false);
        workers[5] = new ContractEmployee("10458206", "9465", 25, 58);
        workers[6] = new SalariedEmployee("10458207", "493570", 1000, 400, true);
        workers[7] = new ContractEmployee("10458208", "9466", 38, 54);
        workers[8] = new SalariedEmployee("10458209", "493571", 1000, 500, false);
        workers[9] = new ContractEmployee("10458210", "9467", 33, 50);

        Stream<Employee> stream = Stream.of(workers);
        stream = stream.sorted(Comparator.comparingInt(Employee::getSalary));
        stream.forEach(Employee::getInfo);
    }
}
