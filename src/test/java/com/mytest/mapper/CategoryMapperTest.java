package com.mytest.mapper;

import com.mytest.Databases.Category;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CategoryMapperTest {
    @Autowired
    CategoryMapper categoryMapper;

    @Test
    public void findAllCategory() {
        List<Category> categories = categoryMapper.findAllCategory();
        Assert.assertNotEquals(0,categories.size());
    }

    @Test
    public void findCategoryByCateName()
    {
        List<Category> categories=categoryMapper.findCategoryByCateName("时事热点");
        Assert.assertNotEquals(0,categories.size());
    }

    @Test
    public void findCategoryBylikeCateNameAndCateId()
    {
        List<Category> categories=categoryMapper.findCategoryBylikeCateNameAndCateId("%热点%","2");
        Assert.assertNotEquals(0,categories.size());
    }

    @Test
    public void findCategoryBylikeCateNameAndCateIdMap()
    {
        Map<String,Object> data=new HashMap<>();
        data.put("name","%爱生%");
        data.put("id","1");
        List<Category> categories=categoryMapper.findCategoryBylikeCateNameAndCateIdMap(data);
        Assert.assertNotEquals(0,categories.size());
    }

}