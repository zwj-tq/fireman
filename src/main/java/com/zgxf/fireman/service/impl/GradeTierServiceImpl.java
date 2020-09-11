package com.zgxf.fireman.service.impl;

import com.zgxf.fireman.bean.GradeTier;
import com.zgxf.fireman.mapper.GradeTierMapper;
import com.zgxf.fireman.service.GradeTierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 范颂扬
 * @create 2020-09-09 20:47
 */
@Service
public class GradeTierServiceImpl implements GradeTierService {

    @Autowired
    private GradeTierMapper gradeTierMapper;

    @Override
    public boolean addTier(GradeTier tier) {
        int result = gradeTierMapper.insertSelective(tier);
        return result > 0;
    }

    @Override
    public boolean deleteTierById(Integer id) {
        int result = gradeTierMapper.deleteByPrimaryKey(id);
        return result > 0;
    }

    @Override
    public boolean updateTierById(GradeTier tier) {
        int result = gradeTierMapper.updateByPrimaryKeySelective(tier);
        return result > 0;
    }

    @Override
    public GradeTier getTierById(Integer id) {
        return gradeTierMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GradeTier> getAllTier() {
        return gradeTierMapper.selectByExample(null);
    }
}
