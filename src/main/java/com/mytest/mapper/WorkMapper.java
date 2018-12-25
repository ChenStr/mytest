package com.mytest.mapper;

import com.mytest.VO.WorksVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WorkMapper {
    //通过文章id查询一篇文章


    //查看所有文章
    List<WorksVO> findAll();
}
