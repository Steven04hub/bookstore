package com.example.mapper;

import com.example.entity.Books;

import java.util.List;

public interface BooksMapper {
    int insert(Books books);

    /**
     * 删除
     */
    int deleteById(Integer id);

    /**
     * 修改
     */
    int updateById(Books books);

    /**
     * 根据ID查询
     */
    Books selectById(Integer id);

    /**
     * 查询所有
     */
    List<Books> selectAll(Books books);
}
