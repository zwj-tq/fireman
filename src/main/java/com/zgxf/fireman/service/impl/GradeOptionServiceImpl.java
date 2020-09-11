package com.zgxf.fireman.service.impl;

import com.zgxf.fireman.bean.GradeOption;
import com.zgxf.fireman.mapper.GradeOptionMapper;
import com.zgxf.fireman.service.GradeOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 范颂扬
 * @create 2020-09-09 19:55
 */
@Service
public class GradeOptionServiceImpl implements GradeOptionService {

    @Autowired
    private GradeOptionMapper gradeOptionMapper;

    @Override
    public boolean addOption(GradeOption option) {
        int result = gradeOptionMapper.insertSelective(option);
        return result > 0;
    }

    @Override
    public boolean deleteOptionById(Integer id) {
        int result = gradeOptionMapper.deleteByPrimaryKey(id);
        return result > 0;
    }

    @Override
    public boolean updateOptionById(GradeOption option) {
        int result = gradeOptionMapper.updateByPrimaryKeySelective(option);
        return result > 0;
    }

    @Override
    public GradeOption getOptionById(Integer id) {
        return gradeOptionMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GradeOption> getAllOption() {
        return gradeOptionMapper.selectByExample(null);
    }
}
