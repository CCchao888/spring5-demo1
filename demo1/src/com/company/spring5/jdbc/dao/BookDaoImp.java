package com.company.spring5.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImp implements BookDao{
    //注入JdbcTemplate
    private JdbcTemplate jdbcTemplate;
}
