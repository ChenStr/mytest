package com.mytest.Databases;

import lombok.Data;

/**
 *对应文章表
 */

@Data
public class Works {
    //文章id
    private String workId;
//    private String id;
    //文章标题
    private String workTitle;
    //文章内容
    private String workText;
    //文章图片
    private String workImg;
    //文章作者id
    private String userId;
    //文章对应栏目id
    private String cateId;
    //文章状态(0已删除,1未删除)
    private Integer workStatus;
}
