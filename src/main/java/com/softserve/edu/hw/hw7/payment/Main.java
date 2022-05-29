package com.softserve.edu.hw.hw7.payment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> staff = new ArrayList<>();
        Collections.addAll(staff,
                new SalariedEmployee("1","32712812399", 1500.0, Profession.DATA_ANALYST),
                new SalariedEmployee("2","311712123123", 500.0, Profession.TEACHER),
                new SalariedEmployee("3","27012123989",1000.0, Profession.MILITARY),
                new ContractEmployee("4","390089",170,55,Profession.ENGINEER),
                new ContractEmployee("5","540099",160,45,Profession.DEVELOPER),
                new ContractEmployee("6","490043",150,100,Profession.DOCTOR)
        );

        System.out.println(" -------------------------------- ArrayList before sorting : ");
        staff.forEach(elem -> {
            System.out.println(elem.toString());
        });

        System.out.println(" -------------------------------- ArrayList after sorting : ");
        Collections.sort(staff, new Employee.SalaryComparator());
        staff.forEach(elem -> {
            System.out.println(elem.toString());
        });

    }
}
