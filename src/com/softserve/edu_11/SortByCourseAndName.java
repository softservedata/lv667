package com.softserve.edu_11;

import java.util.Comparator;

public class SortByCourseAndName implements Comparator <Student> {
    public int compare(Student a, Student b) {
        a.getFirstName().compareTo(b.getFirstName());
        return a.getCourse() - b.getCourse();
    }
}
