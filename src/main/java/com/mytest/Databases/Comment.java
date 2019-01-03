package com.mytest.Databases;
import lombok.Data;

/**
 * 映射comment表
 */

@Data
public class Comment {
    //对应评论id
    private String commentId;
//    private String id;
    //对应评论内容
    private String commentText;
    //对应文章id
    private String cworkId;
    //对应用户id
    private String cuserId;
    //对应评论状态
    private Integer commentStatus;
}
