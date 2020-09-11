package com.zgxf.fireman.service;

import com.zgxf.fireman.bean.GradeHistory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 范颂扬
 * @create 2020-09-09 19:45
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GradeHistoryServiceTest {

    @Autowired
    private GradeHistoryService gradeHistoryService;

    @Test
    public void addHistory() {
    }

    @Test
    public void deleteHistoryByHId() {
    }

    @Test
    public void updateHistoryByHId() {
    }

    @Test
    public void getHistoryByHId() {
        GradeHistory history = gradeHistoryService.getHistoryByHId(24);
        System.out.println(history);
    }

    @Test
    public void getAllHistory() {
        List<GradeHistory> allHistory = gradeHistoryService.getAllHistory();
        System.out.println(allHistory);
    }
}