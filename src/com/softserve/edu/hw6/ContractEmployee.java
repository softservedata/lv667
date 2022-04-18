package com.softserve.edu.hw6;

public class ContractEmployee extends Employee {
    private String federalTaxIdmember;
    private int fixedMonthlyPayment;

    public ContractEmployee(String employeeId, String federalTaxIdmember, int fixedMonthlyPayment) {
        super(employeeId);
        this.federalTaxIdmember = federalTaxIdmember;
        setFixedMonthlyPayment(fixedMonthlyPayment);
        super.salary = calculatePay();
    }


    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
        if (fixedMonthlyPayment < 6000) {
            throw new IllegalArgumentException("Minimal mounthly payment in our country is 6000 uah");
        }
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }


    @Override
    public int calculatePay() {
        return this.fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "employeeId='" + employeeId + '\'' + " , " +
                "federalTaxIdmember='" + federalTaxIdmember + '\'' +
                ", salary=" + salary +
                '}';
    }
}
