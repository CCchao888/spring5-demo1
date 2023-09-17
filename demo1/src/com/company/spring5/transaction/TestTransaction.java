package com.company.spring5.transaction;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTransaction {
    @Test
    public void testAccountMoney1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanJdbc.xml");
        UserService userService = context.getBean("userService",UserService.class);
        userService.accountMoney();
    }
    @Test
    public void testAccountMoney2_AllAnno(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService",UserService.class);
        userService.accountMoney();
    }
}
