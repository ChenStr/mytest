package com.mytest.mapper;

import com.mytest.Databases.Category;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Test
    public void AddOneCategory()
    {
//        Object str=categoryMapper.AddOneCategory("4","测试栏目");
//        Assert.assertNotNull(str);
        int t = categoryMapper.AddOneCategory("4","测试栏目");
        System.out.println(t);
    }
    @Test
    public void DeleteOneCategory()
    {
        int t = categoryMapper.DeleteOneCategory("4");
        System.out.println(t);
    }

    @Test
    public void UpdateOneCategory()
    {
        int t = categoryMapper.UpdateOneCategory("4","柠檬酸了");
        System.out.println(t);
    }
}