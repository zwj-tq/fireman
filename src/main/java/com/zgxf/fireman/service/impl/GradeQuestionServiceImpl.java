package com.zgxf.fireman.service.impl;

import com.zgxf.fireman.bean.GradeQuestion;
import com.zgxf.fireman.bean.example.GradeQuestionExample;
import com.zgxf.fireman.mapper.GradeQuestionMapper;
import com.zgxf.fireman.service.GradeQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 范颂扬
 * @create 2020-09-09 20:34
 */
@Service
public class GradeQuestionServiceImpl implements GradeQuestionService {

    @Autowired
    private GradeQuestionMapper gradeQuestionMapper;

    @Override
    public boolean addQuestion(GradeQuestion question) {
        int result = gradeQuestionMapper.insertSelective(question);
        return result > 0;
    }

    @Override
    public boolean deleteQuestion(Integer qId) {
        int result = gradeQuestionMapper.deleteByPrimaryKey(qId);
        return result > 0;
    }

    @Override
    public boolean updateQuestion(GradeQuestion question) {
        int result = gradeQuestionMapper.updateByPrimaryKeySelective(question);
        return result > 0;
    }

    @Override
    public List<GradeQuestion> getQuestionByUseType(String useType) {
        GradeQuestionExample example = new GradeQuestionExample();
        example.createCriteria().andUseTypeEqualTo(useType);
        return gradeQuestionMapper.selectByExample(example);
    }
}
