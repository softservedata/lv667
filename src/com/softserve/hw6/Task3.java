package com.softserve.hw6;

import static com.softserve.hw6.HTTPError.FORBIDDEN;

enum HTTPError {
    UNAUTHORIZED("401 Unauthorized"),
    FORBIDDEN("403 Forbidden"),
    CONFLICT("409 Conflict"),
    GONE("410 Gone");

    private String name;

    private HTTPError(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HTTPError{" +
                "name='" + name + '\'' +
                '}';
    }

    public HTTPError nextHTTPError() {
        if (this == UNAUTHORIZED)
            return FORBIDDEN;
        if (this == FORBIDDEN)
            return CONFLICT;
        if (this == CONFLICT)
            return GONE;
        return UNAUTHORIZED;
    }
}

public class Task3 {
    public static void main(String[] args) {
        HTTPError httpError;
        httpError = HTTPError.UNAUTHORIZED;
        System.out.println("httpError.toString() = " + httpError);
        System.out.println("httpError.name() = " + httpError.name());
        httpError = FORBIDDEN;
        System.out.println("httpError.toString() = " + httpError);
        System.out.println("httpError.name() = " + httpError.name());
        httpError = HTTPError.CONFLICT;
        System.out.println("httpError.toString() = " + httpError);
        System.out.println("httpError.name() = " + httpError.name());
        httpError = HTTPError.GONE;
        System.out.println("httpError.toString() = " + httpError);
        System.out.println("httpError.name() = " + httpError.name());
//        HTTPError httpError = HTTPError.UNAUTHORIZED;
//        System.out.println("Next HTTP Error = " + httpError.nextHTTPError().name());
    }
}
