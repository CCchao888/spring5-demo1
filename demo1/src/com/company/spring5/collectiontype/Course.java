package com.company.spring5.collectiontype;

public class Course {
    private String cname;

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
