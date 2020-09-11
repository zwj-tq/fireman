package com.zgxf.fireman.service.impl;

import com.zgxf.fireman.bean.GradeCareer;
import com.zgxf.fireman.mapper.GradeCareerMapper;
import com.zgxf.fireman.service.GradeCareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 范颂扬
 * @create 2020-09-09 19:11
 */
@Service
public class GradeCareerServiceImpl implements GradeCareerService {

    @Autowired
    private GradeCareerMapper gradeCareerMapper;

    @Override
    public boolean addCareer(GradeCareer career) {
        int result = gradeCareerMapper.insertSelective(career);
        return result > 0;
    }

    @Override
    public boolean deleteCareerByCId(Integer cId) {
        int result = gradeCareerMapper.deleteByPrimaryKey(cId);
        return result > 0;
    }

    @Override
    public boolean updateCareerByCId(GradeCareer career) {
        int result = gradeCareerMapper.updateByPrimaryKeySelective(career);
        return false;
    }

    @Override
    public GradeCareer getCareerByCId(Integer cId) {
        return gradeCareerMapper.selectByPrimaryKey(cId);
    }

    @Override
    public List<GradeCareer> getAllCareer() {
        return gradeCareerMapper.selectByExample(null);
    }
}
