package com.company.spring5.annotation.service2;


import com.company.spring5.config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tes1 {
    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean10.xml");
        UserService2 userService2 = context.getBean("userService2",UserService2.class);
        userService2.add();
    }
    @Test
    public void testConfig(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService2 userService2 = context.getBean("userService2",UserService2.class);
        userService2.add();
    }
}
