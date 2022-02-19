package com.softserve.edu.hm4;

public enum HTTPError {

    NOT_FOUND(404, "NOT_FOUND"),
    FORBIDDEN(403, "FORBIDDEN"),
    BAD_REQUEST(400, "BAD_REQUEST"),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed");

    private final int errorCode;
    private final String errorTitle;

    HTTPError(int error,String description){
        this.errorCode=error;
        this.errorTitle=description;
    }

    public int getError(){return errorCode;}
    public String getErrorTitle(){return errorTitle;}

    @Override
    public String toString() {
        return "HTTPError{" +
                "errorCode=" + errorCode +
                ", errorTitle='" + errorTitle + '\'' +
                '}';
    }
}
