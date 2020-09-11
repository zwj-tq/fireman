package com.zgxf.fireman.mapper;

import com.zgxf.fireman.bean.GradeUser;
import com.zgxf.fireman.bean.example.GradeUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GradeUserMapper {
    long countByExample(GradeUserExample example);

    int deleteByExample(GradeUserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(GradeUser record);

    int insertSelective(GradeUser record);

    List<GradeUser> selectByExample(GradeUserExample example);

    GradeUser selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") GradeUser record, @Param("example") GradeUserExample example);

    int updateByExample(@Param("record") GradeUser record, @Param("example") GradeUserExample example);

    int updateByPrimaryKeySelective(GradeUser record);

    int updateByPrimaryKey(GradeUser record);
}