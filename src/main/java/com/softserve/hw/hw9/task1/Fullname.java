package com.softserve.hw.hw9.task1;

public class Fullname implements Comparable<Fullname> { //
    private String fname;
    private String lname;

    public Fullname(String fname, String lname){
        setFname(fname);
        setLname(lname);
    }

    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fullname)) return false;

        Fullname fullname = (Fullname) o;

        if (!getFname().equals(fullname.getFname())) return false;
        return getLname().equals(fullname.getLname());
    }

    @Override
    public int hashCode() {
        int result = getFname().hashCode();
        result = 31 * result + getLname().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Fullname{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Fullname fullname) {
        return fullname.getFname().compareTo(getFname()); // getFname().compareTo(fullname.getFname()); //
    }
}
