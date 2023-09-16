package com.company.spring5.jdbc.test;

import com.company.spring5.jdbc.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanJdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

//        Book book = new Book();
//        book.setUserId("4");
//        book.setUsername("java");
//        book.setUstatus("good");
//        bookService.addBook(book);

//        book.setUserId("1");
//        book.setUsername("spring");
//        book.setUstatus("not bad");
//        bookService.updateBook(book);

  //      bookService.deleteBook("1");

//        System.out.println(bookService.findCount());
//        System.out.println(bookService.findObj("2"));
//        System.out.println(bookService.findAll());

//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"11","spring","nice"};
//        Object[] o2 = {"12","c","great"};
//        Object[] o3 = {"13","python","not bad"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchAdd(batchArgs);

//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"spring","nice","3"};
//        Object[] o2 = {"c","great","4"};
//        Object[] o3 = {"python","not bad","5"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchUpdate(batchArgs);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"11"};
        Object[] o2 = {"12"};
        Object[] o3 = {"13"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDelete(batchArgs);
    }

}
