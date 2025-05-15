package com.itheima.service;

import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {

    @Autowired
//    private BookServiceImpl bookService; Spring会查所有实现了接口的类，
//    这里只有一个，所以可以这样写
    private BookService bookService;


    @Test
    public void testQueryBookById(){
        Book book = bookService.queryBookById(3);
        System.out.println(book);
    }

    @Test
    public void testQueryBookAll(){
        bookService.queryBookAll().forEach(System.out::println);
    }

    @Test
    public void testAddBook(){
        Book book = new Book();
        book.setType("测试");
        book.setName("测试");
        book.setDescription("测试");
        bookService.addBook(book);
        System.out.println("添加成功");
    }

    @Test
    public void testUpdateBook(){
        Book book = new Book();
        book.setId(6);
        book.setType("测试");
        book.setName("测试");
        book.setDescription("测试");
        bookService.updateBook(book);
        System.out.println(book);
    }

    @Test
    public void testDeleteBookById(){
        bookService.deleteBookById(5);
        System.out.println("删除成功");
    }
}
