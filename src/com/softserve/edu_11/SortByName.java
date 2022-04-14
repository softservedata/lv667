package com.softserve.edu_11;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getFirstName().compareTo(b.getFirstName());
    }

}
