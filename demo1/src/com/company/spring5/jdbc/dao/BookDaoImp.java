package com.company.spring5.jdbc.dao;

import com.company.spring5.jdbc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImp implements BookDao{
    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加书的方法
    @Override
    public void add(Book book) {
        //创建sql语句
        String sql = "insert into user_db.t_book value(?,?,?)";
        //调用方法实现
        Object[] args = {book.getUserId(),book.getUsername(),book.getUstatus()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);

    }
}
