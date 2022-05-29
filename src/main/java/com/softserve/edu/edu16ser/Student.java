package com.softserve.edu.edu16ser;

import java.io.Serializable;

public class Student implements Serializable {

    private static final Long SerialVersionUID = 1L;

    protected static String text;
    private String fname;
    private String lname;
    private transient String password;

    public Student(String fname, String lname,String text,String password){
        Student.text = text;
        this.fname = fname;
        this.lname = lname;
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "text='" + text + '\'' +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}