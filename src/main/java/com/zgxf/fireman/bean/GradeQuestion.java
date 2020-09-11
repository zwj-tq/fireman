package com.zgxf.fireman.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 评分问题表
 */
@Data
@Accessors(chain = true)
public class GradeQuestion {
    private Integer qid;

    private String item;

    private String quesContent;

    private Integer maxScore;

    private String useType;

}