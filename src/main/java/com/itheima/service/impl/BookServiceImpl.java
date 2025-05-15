package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean addBook(Book book) {
        bookDao.addBook(book);
        return true;
    }

    @Override
    public boolean deleteBookById(Integer id) {
        bookDao.deleteBookById(id);
        return true;
    }

    @Override
    public boolean updateBook(Book book) {
        bookDao.updateBook(book);
        return true;
    }

    @Override
    public Book queryBookById(Integer id) {
        return bookDao.queryBookById(id);
    }

    @Override
    public List<Book> queryBookAll() {
        return bookDao.queryBookAll();
    }
}
