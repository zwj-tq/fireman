package com.zgxf.fireman.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 权限表
 */
@Data
@Accessors(chain = true)
public class GradeTier {
    private Integer tid;

    private String tname;

    private String clist;

}