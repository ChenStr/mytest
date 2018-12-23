package com.mytest.mapper;

import com.mytest.Databases.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<Category> findAllCategory();

    List<Category> findCategoryByCateName(@Param("cateName") String cateName);

//    List<Category> test(@Param("datebase") String datebase);

    List<Category> findCategoryBylikeCateNameAndCateId(@Param("cateName") String cateName,@Param("cateId") String cateId);
}
