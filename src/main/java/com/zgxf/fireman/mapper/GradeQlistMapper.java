package com.zgxf.fireman.mapper;

import com.zgxf.fireman.bean.example.GradeQlistExample;
import com.zgxf.fireman.bean.GradeQlist;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface GradeQlistMapper {
    long countByExample(GradeQlistExample example);

    int deleteByExample(GradeQlistExample example);

    int deleteByPrimaryKey(GradeQlist key);

    int insert(GradeQlist record);

    int insertSelective(GradeQlist record);

    List<GradeQlist> selectByExample(GradeQlistExample example);

    int updateByExampleSelective(@Param("record") GradeQlist record, @Param("example") GradeQlistExample example);

    int updateByExample(@Param("record") GradeQlist record, @Param("example") GradeQlistExample example);
}