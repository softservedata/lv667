package com.softserve.edu.hm3;

public class Employee {
    private String name;
    private int rate;
    private double hours;
    public static double totalSum;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getRate() {return rate;}
    public void setRate(int rate) {this.rate = rate;}
    public double getHours() {return hours;}
    public void setHours(double hours) {this.hours = hours;}

    Employee(){
    }

    Employee(String name, int rate){
        this.name=name;
        this.rate=rate;
    }

    Employee(String name, int rate, double hours){
        this.name=name;
        this.rate=rate;
        this.hours=hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public double getSalary(){
        return getRate()*getHours();
    }
    public double getBonuses(){
        return getSalary()*0.1;
    }
    public void changeRate(int rate){setRate(rate);}

    public static void main(String[] args) {
        Employee javaDev = new Employee("Mark",4500, 40);
        Employee dataAnalyst = new Employee("Olya",2500, 44);
        Employee systemAnalyst = new Employee("Bodya",3500, 38);

        System.out.println("javaDev salary is:"+javaDev.getSalary()
                +"\ndataAnalyst salary is:" + dataAnalyst.getSalary()
                +"\nsystemAnalyst salary is:" + systemAnalyst.getSalary()
                +"\ntotal salary of all units is:" +(javaDev.getSalary() + dataAnalyst.getSalary() + systemAnalyst.getSalary())
                );

        System.out.println("extra salary bonus for SA position is: " + systemAnalyst.getBonuses());
    }
}
