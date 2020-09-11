package com.zgxf.fireman.mapper;

import com.zgxf.fireman.bean.GradeCareer;
import com.zgxf.fireman.bean.example.GradeCareerExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GradeCareerMapper {
    long countByExample(GradeCareerExample example);

    int deleteByExample(GradeCareerExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(GradeCareer record);

    int insertSelective(GradeCareer record);

    List<GradeCareer> selectByExample(GradeCareerExample example);

    GradeCareer selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") GradeCareer record, @Param("example") GradeCareerExample example);

    int updateByExample(@Param("record") GradeCareer record, @Param("example") GradeCareerExample example);

    int updateByPrimaryKeySelective(GradeCareer record);

    int updateByPrimaryKey(GradeCareer record);
}