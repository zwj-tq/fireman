package com.zgxf.fireman.service.impl;

import com.zgxf.fireman.bean.GradeHistory;
import com.zgxf.fireman.mapper.GradeHistoryMapper;
import com.zgxf.fireman.service.GradeHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 范颂扬
 * @create 2020-09-09 19:26
 */
@Service
public class GradeHistoryServiceImpl implements GradeHistoryService {

    @Autowired
    private GradeHistoryMapper gradeHistoryMapper;

    @Override
    public boolean addHistory(GradeHistory history) {
        int result = gradeHistoryMapper.insertSelective(history);
        return result > 0;
    }

    @Override
    public boolean deleteHistoryByHId(Integer hId) {
        int result = gradeHistoryMapper.deleteByPrimaryKey(hId);
        return result > 0;
    }

    @Override
    public boolean updateHistoryByHId(GradeHistory history) {
        int result = gradeHistoryMapper.updateByPrimaryKeySelective(history);
        return result > 0;
    }

    @Override
    public GradeHistory getHistoryByHId(Integer hId) {
        return gradeHistoryMapper.selectByPrimaryKey(hId);
    }

    @Override
    public List<GradeHistory> getAllHistory() {
        return gradeHistoryMapper.selectByExample(null);
    }
}
