package com.softserve.edu.hw13.task3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class Appl {
    public static void main(String[] args)  {

        DateFormatValidator validator = new DateFormatValidator("MM.dd.YYYY");

        List<String> datesList = new ArrayList<>(){{
            add("05.24.2022");
            add("05-24-2022");
            add("2001-12-31");
            add("01.01.1999");
            add("2011-10-22");
        }};

        datesList.forEach(x -> validator.isValid(x));

    }
}


