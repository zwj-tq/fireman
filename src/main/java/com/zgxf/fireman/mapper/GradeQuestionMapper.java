package com.zgxf.fireman.mapper;

import com.zgxf.fireman.bean.GradeQuestion;
import com.zgxf.fireman.bean.example.GradeQuestionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GradeQuestionMapper {
    long countByExample(GradeQuestionExample example);

    int deleteByExample(GradeQuestionExample example);

    int deleteByPrimaryKey(Integer qid);

    int insert(GradeQuestion record);

    int insertSelective(GradeQuestion record);

    List<GradeQuestion> selectByExample(GradeQuestionExample example);

    GradeQuestion selectByPrimaryKey(Integer qid);

    int updateByExampleSelective(@Param("record") GradeQuestion record, @Param("example") GradeQuestionExample example);

    int updateByExample(@Param("record") GradeQuestion record, @Param("example") GradeQuestionExample example);

    int updateByPrimaryKeySelective(GradeQuestion record);

    int updateByPrimaryKey(GradeQuestion record);
}