package com.softserve.edu_09;

public class SalariedEmployee extends Employee implements Payment{
    private int hourlyPaid;
    private int hour;
    private String socialSecurityNumber;

    public SalariedEmployee(int hourlyPaid, int hour, String socialSecurityNumber) {
        this.hourlyPaid = hourlyPaid;
        this.hour = hour;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return hourlyPaid * hour;
    }

    public int getHourlyPaid() {
        return hourlyPaid;
    }

    public void setHourlyPaid(int hourlyPaid) {
        this.hourlyPaid = hourlyPaid;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    @Override
    public  String toString(){
        return "Hourly paid: " + hourlyPaid + "\nHour: " + hour + "\nSocial security number: " + socialSecurityNumber + "\nSalary: " + calculatePay();
    }
}
