package com.zgxf.fireman.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 职位表
 */
@Data
@Accessors(chain = true)
public class GradeCareer {
    private Integer cid;

    private String cname;

    private Integer tid;
}