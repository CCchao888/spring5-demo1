package com.company.spring5.jdbc.test;

import com.company.spring5.jdbc.entity.Book;
import com.company.spring5.jdbc.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanJdbc.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setUserId("1");
        book.setUsername("java");
        book.setUstatus("good");
        bookService.addBook(book);
    }
}
