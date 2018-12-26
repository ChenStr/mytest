package com.mytest.mapper;

import com.mytest.VO.WorksVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WorkMapper {
    //通过文章id查询一篇文章
    WorksVO findOne(@Param("wordId")String wordId);

    //查看所有文章
    List<WorksVO> findAll();
}
