package com.softserve.edu.hw.hw7.payment;

public class SalariedEmployee extends Employee implements Payment{
    private String socialSecurityNumber;
    private Double fixedMonthlyPayment;
    private Profession title;

    public SalariedEmployee(String employeeld, String socialSecurityNumber, Double fixedMonthlyPayment, Profession title){
        super(employeeld);
        setSocialSecurityNumber(socialSecurityNumber);
        setFixedMonthlyPayment(fixedMonthlyPayment);
        setTitle(title);
        super.setMonthlySalary(calculatePay());
    }

    public String getSocialSecurityNumber() {return socialSecurityNumber;}
    public void setSocialSecurityNumber(String socialSecurityNumber) {this.socialSecurityNumber = socialSecurityNumber;}
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
}