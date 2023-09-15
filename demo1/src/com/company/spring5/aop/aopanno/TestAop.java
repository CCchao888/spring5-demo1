package com.company.spring5.aop.aopanno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void testAopAnno_xml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanaop.xml");
        User user = context.getBean("user",User.class);
        user.add();
    }

    //完全注解开发
    @Test
    public void testAopAnno_ConfigClass(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = context.getBean("user",User.class);
        user.add();
    }
}
