package com.softserve.edu_09;

public class ContractEmployee extends Employee implements Payment{
    private int fixedSalary;
    private double federalTaxIdmember;

    public ContractEmployee(int fixedSalary, double federalTaxIdmember) {
        this.fixedSalary = fixedSalary;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public int calculatePay() {
        return fixedSalary;
    }

    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(double federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }
    @Override
    public String toString(){
        return "Salary: " + fixedSalary + "\nTax: " + federalTaxIdmember;
    }
}
