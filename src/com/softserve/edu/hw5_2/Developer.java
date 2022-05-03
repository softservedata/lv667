package com.softserve.edu.hw5_2;

public class Developer extends Employee {
    private String position;
    private int workTime;

    public Developer(int age, String name, double sallary, String position, int workTime) {
        super(age, name, sallary);
        setPosition(position);
        setWorkTime(workTime);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = checkPosition(position);
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = checkWorkTime(workTime);
    }

    public String checkPosition(String position) {
        if (position == "Trainee"){
            return position;
        }else if (position=="Junior"){
            return position;
        }else if (position=="Middle"){
            return position;
        }
        else if (position=="Senior"){
            return position;
        }
        else throw new IllegalArgumentException("Developer can`t work at this position");



    }

    public int checkWorkTime(int workTime) {
        if (workTime < 5 | workTime > 8) {
            throw new IllegalArgumentException("Work time must be in range of [5:8] hours");
        }
        return workTime;
    }

    @Override
    public String report() {
        return ("Developer :"+getName()+","+"Age: "+getAge()+","+"Sallary: \u20B4"+getSallary()+","+"Position: "+ position + ","+ " Work Time: " + workTime);
    }
}
