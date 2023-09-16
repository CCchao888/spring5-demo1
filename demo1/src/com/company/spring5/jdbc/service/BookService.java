package com.company.spring5.jdbc.service;

import com.company.spring5.jdbc.dao.BookDao;
import com.company.spring5.jdbc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加add方法
    public void addBook(Book book){
        bookDao.add(book);
    }
}
