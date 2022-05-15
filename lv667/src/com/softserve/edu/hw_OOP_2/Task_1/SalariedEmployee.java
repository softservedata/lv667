package com.softserve.edu.hw_OOP_2.Task_1;

public class SalariedEmployee extends Employee implements Payment{
    private String socialSecurityNumber;
    private int rate;
    private int premium;
    boolean havePremium;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, int rate, int premium, boolean havePremium) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.rate = rate;
        this.premium = premium;
        this.havePremium = havePremium;
        CalculatePay();
    }

    @Override
    public int CalculatePay() {
        super.setSalary(rate);
        if(havePremium) setSalary(rate + premium);

        return getSalary();
    }

    @Override
    public void getInfo() {
        System.out.println("\nClass SalariedEmployee");
        System.out.println("Employee ID:            " + super.getEmployeeId());
        System.out.println("Social security number: " + socialSecurityNumber);
        System.out.println("Rate:                   " + rate);
        System.out.println("Have premium:           " + havePremium);
        System.out.println("Premium:                " + premium);
        System.out.println("Salary:                 " + CalculatePay());
    }

}
