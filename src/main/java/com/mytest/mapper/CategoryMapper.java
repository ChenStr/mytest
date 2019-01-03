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

    //添加一个栏目
    int AddOneCategory(@Param("cateId") String cateId,
                       @Param("cateName") String cateName);

    //删除一个栏目
    int DeleteOneCategory(@Param("cateId") String cateId);

    //修改一个栏目
    int UpdateOneCategory(@Param("cateId") String cateId,
                               @Param("cateName") String cateName);
}
