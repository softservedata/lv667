package com.softserve.hw.hw7.payment;

public enum Profession {

    DATA_ANALYST("Data Analytic"),
    ENGINEER("Engineer"),
    DEVELOPER("Developer"),
    DOCTOR("Doctor"),
    TEACHER("Teacher"),
    MILITARY("Military");

    private final String title;

    Profession(String title){
        this.title=title;
    }

    public String getTitle() {
        return title;
    }
}
