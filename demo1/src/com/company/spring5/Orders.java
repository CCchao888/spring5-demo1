package com.company.spring5;

public class Orders {
    private String oname;

    public Orders(String oname) {
        this.oname = oname;
    }
    public void test(){
        System.out.println(oname);
    }
}
