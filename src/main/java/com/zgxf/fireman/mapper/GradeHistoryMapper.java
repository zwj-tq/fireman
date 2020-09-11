package com.zgxf.fireman.mapper;

import com.zgxf.fireman.bean.GradeHistory;
import com.zgxf.fireman.bean.example.GradeHistoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GradeHistoryMapper {
    long countByExample(GradeHistoryExample example);

    int deleteByExample(GradeHistoryExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(GradeHistory record);

    int insertSelective(GradeHistory record);

    List<GradeHistory> selectByExampleWithBLOBs(GradeHistoryExample example);

    List<GradeHistory> selectByExample(GradeHistoryExample example);

    GradeHistory selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") GradeHistory record, @Param("example") GradeHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") GradeHistory record, @Param("example") GradeHistoryExample example);

    int updateByExample(@Param("record") GradeHistory record, @Param("example") GradeHistoryExample example);

    int updateByPrimaryKeySelective(GradeHistory record);

    int updateByPrimaryKeyWithBLOBs(GradeHistory record);

    int updateByPrimaryKey(GradeHistory record);
}