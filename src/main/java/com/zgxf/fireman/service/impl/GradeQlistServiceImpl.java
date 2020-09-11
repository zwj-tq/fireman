package com.zgxf.fireman.service.impl;

import com.zgxf.fireman.bean.GradeQlist;
import com.zgxf.fireman.bean.example.GradeQlistExample;
import com.zgxf.fireman.mapper.GradeQlistMapper;
import com.zgxf.fireman.service.GradeQlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 范颂扬
 * @create 2020-09-09 20:15
 */
@Service
public class GradeQlistServiceImpl implements GradeQlistService {

    @Autowired
    private GradeQlistMapper gradeQlistMapper;

    @Override
    public boolean addQlist(GradeQlist qlist) {
        int result = gradeQlistMapper.insertSelective(qlist);
        return result > 0;
    }

    @Override
    public boolean deleteQlistByTidAndQid(GradeQlist qlist) {
        int result = gradeQlistMapper.deleteByPrimaryKey(qlist);
        return result > 0;
    }

    @Override
    public boolean updateQlistByTidAndQid(GradeQlist qlist) {
        GradeQlistExample example = new GradeQlistExample();
        example.createCriteria().andQidEqualTo(qlist.getQid())
                .andTidEqualTo(qlist.getTid());
        int result = gradeQlistMapper.updateByExampleSelective(qlist, example);
        return result > 0;
    }

    @Override
    public List<GradeQlist> getQlistByTId(Integer tId) {
        GradeQlistExample example = new GradeQlistExample();
        example.createCriteria().andTidEqualTo(tId);
        return gradeQlistMapper.selectByExample(example);
    }

    @Override
    public List<GradeQlist> getAllQlist() {
        return gradeQlistMapper.selectByExample(null);
    }
}
