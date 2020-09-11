package com.zgxf.fireman.mapper;

import com.zgxf.fireman.bean.GradeTier;
import com.zgxf.fireman.bean.example.GradeTierExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GradeTierMapper {
    long countByExample(GradeTierExample example);

    int deleteByExample(GradeTierExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(GradeTier record);

    int insertSelective(GradeTier record);

    List<GradeTier> selectByExample(GradeTierExample example);

    GradeTier selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") GradeTier record, @Param("example") GradeTierExample example);

    int updateByExample(@Param("record") GradeTier record, @Param("example") GradeTierExample example);

    int updateByPrimaryKeySelective(GradeTier record);

    int updateByPrimaryKey(GradeTier record);
}