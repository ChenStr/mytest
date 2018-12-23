package com.mytest.mapper;

import com.mytest.Databases.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<Category> findAllCategory();
}
