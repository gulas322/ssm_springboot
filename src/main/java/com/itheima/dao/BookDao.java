package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
// 需要这个注解将这个接口映射为实体类
public interface BookDao {

    // 这里的添加、删除、修改、查询方法都简单来写，只写与数据库相关的操作，不要搞复杂了返回值
    // 复杂的内容放到service层来做
//    @Insert("insert into tbl_book values(null,#{type},#{name},#{description})")
    void addBook(Book book);

//    @Delete("delete from tbl_book where id = #{id}")
    void deleteBookById(Integer id);

//    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    void updateBook(Book book);

//    @Select("select * from tbl_book where id = #{id}")
    Book queryBookById(Integer id);

//    @Select("select * from tbl_book")
    List<Book> queryBookAll();
}
