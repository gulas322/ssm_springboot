package com.itheima.service;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {

    @Autowired
//    private BookServiceImpl bookService; Spring会查所有实现了接口的类，
//    这里只有一个，所以可以这样写
    private BookDao bookDao;


    @Test
    public void testQueryBookById(){
        Book book = bookDao.queryBookById(3);
        System.out.println(book);
    }

    @Test
    public void testQueryBookAll(){
        bookDao.queryBookAll().forEach(System.out::println);
    }

    @Test
    public void testAddBook(){
        Book book = new Book();
        book.setType("测试");
        book.setName("测试");
        book.setDescription("测试");
        bookDao.addBook(book);
        System.out.println("添加成功");
    }

    @Test
    public void testUpdateBook(){
        Book book = new Book();
        book.setId(6);
        book.setType("测试");
        book.setName("测试");
        book.setDescription("测试");
        bookDao.updateBook(book);
        System.out.println(book);
    }

    @Test
    public void testDeleteBookById(){
        bookDao.deleteBookById(5);
        System.out.println("删除成功");
    }
}
