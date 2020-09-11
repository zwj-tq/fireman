package com.zgxf.fireman.service;

import com.zgxf.fireman.bean.GradeCareer;

import java.util.List;

/**
 * @author 范颂扬
 * @create 2020-09-09 19:00
 */
public interface GradeCareerService {

    boolean addCareer(GradeCareer career);

    boolean deleteCareerByCId(Integer cId);

    boolean updateCareerByCId(GradeCareer career);

    GradeCareer getCareerByCId(Integer cId);

    List<GradeCareer> getAllCareer();

}
