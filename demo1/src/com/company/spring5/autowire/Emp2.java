package com.company.spring5.autowire;

public class Emp2 {
    private Dept2 dept2;

    public void setDept2(Dept2 dept2) {
        this.dept2 = dept2;
    }


    public void test(){
        System.out.println(dept2);
    }
}
