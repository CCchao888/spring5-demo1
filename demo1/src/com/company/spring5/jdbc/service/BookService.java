package com.company.spring5.jdbc.service;

import com.company.spring5.jdbc.dao.BookDao;
import com.company.spring5.jdbc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加add方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    public void updateBook(Book book){
        bookDao.update(book);
    }

    public void deleteBook(String id){
        bookDao.delete(id);
    }
    //查询返回某个值，表的记录数
    public int findCount(){
        return bookDao.selectCount();
    }
    //查询返回对象
    public Book findObj(String id){
        return bookDao.findBookInfo(id);
    }
    //查询返回集合
    public List<Book> findAll(){
        return bookDao.findAllBook();
    }
    //批量添加数据
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }
    //批量修改数据
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }
    //批量删除数据
    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDeleteBook(batchArgs);
    }
}
