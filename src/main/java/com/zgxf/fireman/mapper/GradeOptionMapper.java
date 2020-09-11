package com.zgxf.fireman.mapper;

import com.zgxf.fireman.bean.GradeOption;
import com.zgxf.fireman.bean.example.GradeOptionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GradeOptionMapper {
    long countByExample(GradeOptionExample example);

    int deleteByExample(GradeOptionExample example);

    int deleteByPrimaryKey(Integer optionId);

    int insert(GradeOption record);

    int insertSelective(GradeOption record);

    List<GradeOption> selectByExample(GradeOptionExample example);

    GradeOption selectByPrimaryKey(Integer optionId);

    int updateByExampleSelective(@Param("record") GradeOption record, @Param("example") GradeOptionExample example);

    int updateByExample(@Param("record") GradeOption record, @Param("example") GradeOptionExample example);

    int updateByPrimaryKeySelective(GradeOption record);

    int updateByPrimaryKey(GradeOption record);
}