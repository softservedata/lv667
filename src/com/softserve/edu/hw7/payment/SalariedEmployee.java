package com.softserve.edu.hw7.payment;

import java.util.Comparator;

public class SalariedEmployee extends Employee implements Payment, Comparator<SalariedEmployee> {
    private String socialSecurityNumber;
    private Double fixedMonthlyPayment;
    private Profession title;

    public SalariedEmployee(String employeeld, String socialSecurityNumber, Double fixedMonthlyPayment, Profession title){
        super(employeeld);
        setSocialSecurityNumber(socialSecurityNumber);
        setFixedMonthlyPayment(fixedMonthlyPayment);
        setTitle(title);
    }
    public String getSocialSecurityNumber() {return socialSecurityNumber;}
    public void setSocialSecurityNumber(String socialSecurityNumber) {this.socialSecurityNumber = socialSecurityNumber;}
    public Double getFixedMonthlyPayment() {return fixedMonthlyPayment;}
    public void setFixedMonthlyPayment(Double fixedMonthlyPayment) {this.fixedMonthlyPayment = fixedMonthlyPayment;}

    public Profession getTitle() {return title;}
    public void setTitle(Profession title) {this.title = title;}

    @Override
    public Double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "EmployeeID = " + super.getEmployeeld() +
                ", job title = " + getTitle() +
                ", average monthly salary = " + calculatePay() +
                ", socialSecurityNumber = '" + getSocialSecurityNumber() + '\'' +
                '}';
    }

    @Override
    public int compare(SalariedEmployee t1, SalariedEmployee t2) {
        return (int)(t1.calculatePay() - t2.calculatePay());
    }
}