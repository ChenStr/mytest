package com.mytest.mapper;

import com.mytest.Databases.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface CategoryMapper {
    List<Category> findAllCategory();

    List<Category> findCategoryByCateName(@Param("cateName") String cateName);

    List<Category> findCategoryBylikeCateNameAndCateId(@Param("cateName") String cateName,@Param("cateId") String cateId);

    List<Category> findCategoryBylikeCateNameAndCateIdMap(Map<String,Object> data);
}
