package com.zgxf.fireman.service;

import com.zgxf.fireman.bean.GradeUser;

import java.util.List;

/**
 * @author 范颂扬
 * @create 2020-09-09 20:51
 */
public interface GradeUserService {

    boolean addUser(GradeUser user);

    boolean deleteUserById(Integer id);

    boolean updateUserById(GradeUser user);

    boolean verify(Integer uId, String password);

    GradeUser getUserByUId(Integer uId);

    List<GradeUser> getUsersByClassId(Integer classId);
}
