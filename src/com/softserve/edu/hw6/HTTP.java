package com.softserve.edu.hw6;

public class HTTP {
    public static void main(String[] args) {
        HTTPError op = HTTPError.CLIENT_ERROR;
        System.out.println(op.action(403));


    }
}

enum HTTPError{
    CLIENT_ERROR{
        public String action(int x) {
            if(x == 400) {
                return "400 Bad Request";
            }
            if(x == 401) {
                return "401 Unauthorized (RFC 7235)";
            }
            if(x == 402) {
                return "402 Payment Requaired";
            }
            if(x == 403) {
                return "403 Forbidden";
            }
            return "Unknown code";
        }
    };
    public abstract String action(int x);
}