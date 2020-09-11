package com.zgxf.fireman.service;

import com.zgxf.fireman.bean.GradeCareer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 范颂扬
 * @create 2020-09-09 19:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GradeCareerServiceTest {

    @Autowired
    private GradeCareerService gradeCareerService;

    @Test
    public void addCareer() {
        boolean result = gradeCareerService.addCareer(new GradeCareer().setCname("副大队长"));
        System.out.println(result);
    }

    @Test
    public void deleteCareer() {
    }

    @Test
    public void updateCareerByCId() {

    }

    @Test
    public void getCareerByCId() {
        GradeCareer career = gradeCareerService.getCareerByCId(1);
        System.out.println(career);
    }

    @Test
    public void getAllCareer() {
        List<GradeCareer> allCareer = gradeCareerService.getAllCareer();
        System.out.println(allCareer);
    }
}