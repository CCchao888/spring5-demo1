package com.company.spring5.test;

import com.company.spring5.transaction.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//使用Junit5

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:beanJdbc.xml")
public class TestJunit5 {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountMoney();
    }
}
