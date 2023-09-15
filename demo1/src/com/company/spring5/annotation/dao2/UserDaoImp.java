package com.company.spring5.annotation.dao2;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service(value = "userDaoImp")
public class UserDaoImp implements UserDao{
    @Override
    public void add() {
        System.out.println("userdao......");
    }
}
