package com.company.spring5.test;

import com.company.spring5.beanlife.Orders2;
import com.company.spring5.collectiontype.Book2;
import com.company.spring5.collectiontype.Course;
import com.company.spring5.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {
    @Test
    public void testCollection1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Stu stu = context.getBean("stu",Stu.class);
        stu.test();
    }
    @Test
    public void testCollection2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Book2 book2 = context.getBean("book2",Book2.class);
        book2.test();
    }
    @Test
    public void testCollection3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        //MyBean myBean = context.getBean("myBean", MyBean.class);
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }
    @Test
    public void testBeanLife(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean7.xml");
        Orders2 orders2 = context.getBean("orders2",Orders2.class);
        System.out.println("第四步，获取创建bean实例对象");
        System.out.println(orders2);
        //手动让bean实例销毁
        //((ClassPathXmlApplicationContext)context).close();
        context.close();
    }
}
