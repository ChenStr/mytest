package com.mytest.mapper;

import com.mytest.VO.WorksVO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkMapperTest {

    @Autowired
    WorkMapper workMapper;

    @Test
    public void findAll() {
        List<WorksVO> works=workMapper.findAll();
        Assert.assertNotEquals(0,works.size());
    }
}