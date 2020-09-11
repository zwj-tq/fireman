package com.zgxf.fireman.service;

import com.zgxf.fireman.bean.GradeOption;

import java.util.List;

/**
 * @author 范颂扬
 * @create 2020-09-09 19:50
 */
public interface GradeOptionService {

    boolean addOption(GradeOption option);

    boolean deleteOptionById(Integer id);

    boolean updateOptionById(GradeOption option);

    GradeOption getOptionById(Integer id);

    List<GradeOption> getAllOption();

}
