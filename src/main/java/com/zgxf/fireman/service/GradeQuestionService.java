package com.zgxf.fireman.service;

import com.zgxf.fireman.bean.GradeQuestion;

import java.util.List;

/**
 * @author 范颂扬
 * @create 2020-09-09 20:23
 */
public interface GradeQuestionService {

    boolean addQuestion(GradeQuestion question);

    boolean deleteQuestion(Integer qId);

    boolean updateQuestion(GradeQuestion question);

    List<GradeQuestion> getQuestionByUseType(String useType);

}
