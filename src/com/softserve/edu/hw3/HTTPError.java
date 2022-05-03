package com.softserve.edu.hw3;

public enum HTTPError {
    HTTP_ERROR_400("Bad Request", 400), HTTP_ERROR_401("Unauthorized", 401), HTTP_ERROR_402("Payment Required", 402);


    private final String name;
    private final int number;

    HTTPError(String name, int number) {
        this.name = name;
        this.number = number;


    }


    @Override
    public String toString() {
        return "**** " +
                "name of error ='" + name + '\'' +
                ", number of error = " + number +
                '}';
    }
}



