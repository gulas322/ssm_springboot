package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping("/{id}")
    public Result queryBookById(@PathVariable Integer id) {
        Book book = bookService.queryBookById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "查询成功" : "数据查询失败，请联系后端！";
        return new Result(code, book, msg);
    }

    @GetMapping()
    public Result queryBookAll() {
        List<Book> list = bookService.queryBookAll();
        if (list != null) {
            return new Result(Code.GET_OK, list, "查询成功");
        } else {
            return new Result(Code.GET_ERR, null, "数据查询失败，请联系后端！");
        }
    }

    @PostMapping()
    public Result addBook(@RequestBody Book book) {
        boolean flag = bookService.addBook(book);
        Integer code = flag ? Code.SAVE_OK : Code.SAVE_ERR;
        String msg = flag ? "添加成功" : "添加失败，请联系后端！";
        return new Result(code, flag, msg);
    }

    @PutMapping("/{id}")
    public Result updateBook(@RequestBody Book book) {
        boolean flag = bookService.updateBook(book);
        Integer code = flag ? Code.UPDATE_OK : Code.UPDATE_ERR;
        String msg = flag ? "修改成功" : "修改失败，请联系后端！";
        return new Result(code, flag, msg);
    }

    @DeleteMapping("/{id}")
    public Result deleteBookById(@PathVariable Integer id) {
        boolean flag = bookService.deleteBookById(id);
        Integer code = flag ? Code.DELETE_OK : Code.DELETE_ERR;
        String msg = flag ? "删除成功" : "删除失败，请联系后端！";
        return new Result(code, flag, msg);
    }

}
