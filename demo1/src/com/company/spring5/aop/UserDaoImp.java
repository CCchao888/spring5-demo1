package com.company.spring5.aop;

public class UserDaoImp implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行力....");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了.....");
        return id;
    }
}
