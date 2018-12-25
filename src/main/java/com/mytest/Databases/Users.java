package com.mytest.Databases;

import lombok.Data;

/**
 * 对应User表
 */

@Data
public class Users {
    //映射用户id
//    private String userId;
    private String id;
    //映射用户name
    private String userName;
    //映射用户pass
    private String userPass;
    //映射用户权限(root)
    private Integer userRoot;
}
