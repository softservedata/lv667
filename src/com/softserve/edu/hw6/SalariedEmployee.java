package com.softserve.edu.hw6;

public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private int hourlyRate;
    private int numberOfHoursWorked;


    public SalariedEmployee(String employeeId, String socialSecurityNumber, int hourlyRate, int numberOfHoursWorked) {
        super(employeeId);

        setHourlyRate(hourlyRate);
        setNumberOfHoursWorked(numberOfHoursWorked);
        this.socialSecurityNumber = socialSecurityNumber;

        super.salary = calculatePay();
    }


    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 50 | hourlyRate > 300) {
            throw new IllegalArgumentException("Hourly rate in our сountry are from min 50  to max 300 uah per hours ");
        }
        this.hourlyRate = hourlyRate;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        if (numberOfHoursWorked < 84 | numberOfHoursWorked > 168) {
            throw new IllegalArgumentException("Number of hours worked in our сountry are from min 8 to max 8 hours per month");
        }
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }


    @Override
    public int calculatePay() {
        return this.hourlyRate * numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "employeeId='" + employeeId + '\'' + " , " +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", salary=" + salary +
                '}';
    }
}
