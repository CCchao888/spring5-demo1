package com.company.spring5.test;

import com.company.spring5.bean.Emp;
import com.company.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService",UserService.class);
        userService.add();
    }
    @Test
    public void testEmp(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp",Emp.class);
        emp.add();
    }
}
