package com.softserve.hw07.HW;

import java.util.Scanner;

class JavaMaserHTTPerror {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter of Client Error");
        int HttpError = 0;
        int code = scanner.nextInt(code = HttpError);
        scanner.nextLine();
        String name = scanner.nextLine();
        if (code >= 400 && code < 500) {
        }
    }

    enum HTTPerror {
        BAD_REQUEST(400, "Bad Request"),
        CONFLICT(409, "Conflict"),
        FORBIDDEN(403, "Forbidden"),
        GONE(410, "Gone"),
        METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
        NOT_ACCEPTABLE(406, "Not Acceptable"),
        NOT_FOUND(404, "Not Found"),
        PAYMENT_REQUIRED(402, "Payment Required"),
        PROXY_AUTHENTICATION_REQUIRED(407, "Proxy Authentication Required"),
        REQUEST_TIMEOUT(408, "Request Timeout"),
        UNAUTHORIZED(401, "Unauthorized"),
        ;

        private String name;
        private int code;

        void HttpError(String name, int code) {
            this.name = name;
            this.code = code;
        }

        HTTPerror(int i, String s) {

        }
    }
}



