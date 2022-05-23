package com.softserve.edu_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String currency = br.readLine();
        String priceOfMilk = "Price of milk $3.32";
        Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
        Matcher m = p.matcher(currency);
        while(m.find()) {
            System.out.println(currency.substring(m.start(), m.end()));
        }
        Matcher n = p.matcher(priceOfMilk);
        while(n.find()) {
            System.out.println(priceOfMilk.substring(n.start(), n.end()));
        }
    }
}
