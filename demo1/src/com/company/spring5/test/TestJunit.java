package com.company.spring5.test;

import com.company.spring5.transaction.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//使用复合注解代替4和5两个注解完成整合
@SpringJUnitConfig(locations = "classpath:beanJdbc.xml")
public class TestJunit {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountMoney();
    }
}
