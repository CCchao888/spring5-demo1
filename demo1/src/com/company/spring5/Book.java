package com.company.spring5;

public class Book {
    private String bname;
    private String bprice;
    private String baddress;

    public void setBaddress(String baddress) {
        this.baddress = baddress;
    }

    public void setBprice(String bprice) {
        this.bprice = bprice;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void test(){
        System.out.println(bname+"::"+bprice+"::"+baddress);
    }
}
