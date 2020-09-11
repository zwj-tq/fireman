package com.zgxf.fireman.service.impl;

import com.zgxf.fireman.bean.GradeUser;
import com.zgxf.fireman.bean.example.GradeUserExample;
import com.zgxf.fireman.mapper.GradeUserMapper;
import com.zgxf.fireman.service.GradeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 范颂扬
 * @create 2020-09-09 20:56
 */
@Service
public class GradeUserServiceImpl implements GradeUserService {

    @Autowired
    private GradeUserMapper gradeUserMapper;

    @Override
    public boolean addUser(GradeUser user) {
        int result = gradeUserMapper.insertSelective(user);
        return result > 0;
    }

    @Override
    public boolean deleteUserById(Integer id) {
        int result = gradeUserMapper.deleteByPrimaryKey(id);
        return result > 0;
    }

    @Override
    public boolean updateUserById(GradeUser user) {
        int result = gradeUserMapper.updateByPrimaryKeySelective(user);
        return result > 0;
    }

    @Override
    public boolean verify(Integer uId, String password) {
        GradeUserExample example = new GradeUserExample();
        example.createCriteria().andUidEqualTo(uId).andPasswordEqualTo(password);
        long result = gradeUserMapper.countByExample(example);
        return result > 0;
    }

    @Override
    public GradeUser getUserByUId(Integer uId) {
        return gradeUserMapper.selectByPrimaryKey(uId);
    }

    @Override
    public List<GradeUser> getUsersByClassId(Integer classId) {
        GradeUserExample example = new GradeUserExample();
        example.createCriteria().andClassIdEqualTo(classId);
        return gradeUserMapper.selectByExample(example);
    }
}
