package com.zgxf.fireman.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 用户表
 */
@Data
@Accessors(chain = true)
public class GradeUser {
    private Integer uid;

    private String uname;

    private String sex;

    private Integer age;

    private String password;

    private Integer cid;

    private String isAdmin;

    private Integer classId;


}