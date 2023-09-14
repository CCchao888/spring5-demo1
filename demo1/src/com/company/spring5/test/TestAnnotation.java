package com.company.spring5.test;

import com.company.spring5.annotation.service2.UserService2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    @Test
    public void testAnnotaion(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-zhujie.xml");
        UserService2 userService2 = context.getBean("userService2",UserService2.class);
        System.out.println(userService2);
        userService2.add();
    }
}
