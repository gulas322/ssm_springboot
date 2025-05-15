package com.itheima.service;

import com.itheima.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    boolean addBook(Book book);

    boolean deleteBookById(Integer id);

    boolean updateBook(Book book);

    Book queryBookById(Integer id);

    List<Book> queryBookAll();
}
