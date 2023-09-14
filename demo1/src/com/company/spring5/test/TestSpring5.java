package com.company.spring5.test;

import com.company.spring5.Book;
import com.company.spring5.Orders;
import com.company.spring5.User;
import com.company.spring5.autowire.Emp2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void testAdd(){
        // 1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // 2、获取配置创建的对象
        User user = context.getBean("user",User.class);

        System.out.println(user);
        user.add();
    }
    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book",Book.class);
        System.out.println(book);
        book.test();
    }
    @Test
    public void testOrders(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = context.getBean("orders",Orders.class);
        System.out.println(orders);
        orders.test();
    }
    @Test
    public void testAutoWire(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");
        Emp2 emp2 = context.getBean("emp2",Emp2.class);
        emp2.test();
    }
}
