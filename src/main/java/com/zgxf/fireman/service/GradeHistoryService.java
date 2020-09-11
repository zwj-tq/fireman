package com.zgxf.fireman.service;

import com.zgxf.fireman.bean.GradeHistory;

import java.util.List;

/**
 * @author 范颂扬
 * @create 2020-09-09 19:10
 */
public interface GradeHistoryService {

    boolean addHistory(GradeHistory history);

    boolean deleteHistoryByHId(Integer hId);

    boolean updateHistoryByHId(GradeHistory history);

    GradeHistory getHistoryByHId(Integer hId);

    List<GradeHistory> getAllHistory();

}
