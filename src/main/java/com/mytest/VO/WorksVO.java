package com.mytest.VO;
import com.mytest.Databases.Category;
import com.mytest.Databases.Comment;
import com.mytest.Databases.Users;
import com.mytest.Databases.Works;
import lombok.Data;
import org.apache.catalina.User;

import java.util.List;

/**
 * 文章详情映射
 */

@Data
public class WorksVO extends Works{

    //映射用户(一对一)
    private Users user;


    //映射评论(一对多)
    private List<Comment> comment;


}
