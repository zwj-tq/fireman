package com.zgxf.fireman.service;

import com.zgxf.fireman.bean.GradeTier;

import java.util.List;

/**
 * @author 范颂扬
 * @create 2020-09-09 20:42
 */
public interface GradeTierService {

    boolean addTier(GradeTier tier);

    boolean deleteTierById(Integer id);

    boolean updateTierById(GradeTier tier);

    GradeTier getTierById(Integer id);

    List<GradeTier> getAllTier();
}
