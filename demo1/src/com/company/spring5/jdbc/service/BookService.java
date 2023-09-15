package com.company.spring5.jdbc.service;

import com.company.spring5.jdbc.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;
}
