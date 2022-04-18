package com.softserve.edu.hw7.payment;

import java.util.Comparator;

public class ContractEmployee extends Employee implements Payment, Comparator<ContractEmployee> {
    private String federalTaxIdmember;
    private double workedHours;
    private double hourlyRate;
    private Profession title;

    public Profession getTitle() {return title;}
    public void setTitle(Profession title) {this.title = title;}

    public ContractEmployee(String employeeld, String federalTaxIdmember, int workedHours, int hourlyRate, Profession title){
        super(employeeld);
        setFederalTaxIdmember(federalTaxIdmember);
        setWorkedHours(workedHours);
        setHourlyRate(hourlyRate);
        setTitle(title);
    }

    public String getFederalTaxIdmember() {return federalTaxIdmember;}
    public void setFederalTaxIdmember(String federalTaxIdmember) {this.federalTaxIdmember = federalTaxIdmember;}
    public double getWorkedHours() {return workedHours;}
    public void setWorkedHours(int workedHours) {this.workedHours = workedHours;}
    public double getHourlyRate() {return hourlyRate;}
    public void setHourlyRate(int hourlyRate) {this.hourlyRate = hourlyRate;}

    @Override
    public Double calculatePay() {
        return getHourlyRate() * getWorkedHours();
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "EmployeeID = " + super.getEmployeeld() +
                ", job title = " + getTitle() +
                ", average monthly salary = " + calculatePay() +
                ", federalTaxIdmember = '" + getFederalTaxIdmember() + '\'' +
                ", workedHours = " + getWorkedHours() +
                ", hourlyRate = " + getHourlyRate() +
                '}';
    }

    @Override
    public int compare(ContractEmployee t1, ContractEmployee t2) {
        return (int)(t1.calculatePay() - t2.calculatePay());
    }
}
