package com.softserve.edu.hw_OOP_2.Task_1;

public class ContractEmployee extends Employee implements Payment{
    private String federalTaxIdMember;
    private int rate;
    private int hoursPerMonth;

    public ContractEmployee(String employeeId, String federalTaxIdMember, int rate, int hoursPerMonth) {
        super(employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
        this.rate = rate;
        this.hoursPerMonth = hoursPerMonth;
        CalculatePay();
    }

    @Override
    public int CalculatePay() {
        setSalary(rate * hoursPerMonth);
        return getSalary();
    }

    @Override
    public void getInfo() {
        System.out.println("\nClass ContractEmployee");
        System.out.println("Employee ID:            " + super.getEmployeeId());
        System.out.println("Federal tax ID number:  " + federalTaxIdMember);
        System.out.println("Rate:                   " + rate);
        System.out.println("Hours per month:        " + hoursPerMonth);
        System.out.println("Salary:                 " + CalculatePay());
    }
}
