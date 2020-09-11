package com.zgxf.fireman.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 评论表
 */
@Data
@Accessors(chain = true)
public class GradeHistory {
    private Integer hid;

    private Integer uid;

    private String writeTime;

    private Integer zfjlScore;

    private Integer rcywScore;

    private Integer zznlScore;

    private Integer gztdScore;

    private Integer zxcyScore;

    private Integer gtjlScore;

    private Integer zwtsScore;

    private Integer sumScore;

    private Integer writerId;

    private String scoreContent;

}