package com.company.spring5.jdbc.dao;

import com.company.spring5.jdbc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

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

    @Override
    public void update(Book book) {
        String sql = "update user_db.t_book set username=?,ustatus=? where user_id=?";
        Object[] args = {book.getUsername(),book.getUstatus(),book.getUserId(),};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void delete(String id) {
        String sql = "delete from user_db.t_book where user_id=?";
        Object[] args = {id};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    //查询返回某个值，表的记录数
    @Override
    public int selectCount() {
        String sql = "select count(*) from user_db.t_book";
        //第二个参数是返回值类型
        int count = jdbcTemplate.queryForObject(sql,Integer.class);
        return count;
    }

    //查询返回对象
    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from user_db.t_book where user_id=?";
        Book book = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),id);
        return book;
    }

    //查询返回集合
    @Override
    public List<Book> findAllBook() {
        String sql = "select * from user_db.t_book";
        List<Book> bookList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into user_db.t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(ints.toString());
    }

    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql = "update user_db.t_book set username=?,ustatus=? where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDeleteBook(List<Object[]> batchArgs) {
        String sql = "delete from user_db.t_book where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
