package com.zgxf.fireman.service;

import com.zgxf.fireman.bean.GradeQlist;

import java.util.List;

/**
 * @author 范颂扬
 * @create 2020-09-09 20:01
 */
public interface GradeQlistService {

    boolean addQlist(GradeQlist qlist);

    boolean deleteQlistByTidAndQid(GradeQlist qlist);

    boolean updateQlistByTidAndQid(GradeQlist qlist);

    List<GradeQlist> getQlistByTId(Integer tId);

    List<GradeQlist> getAllQlist();

}
