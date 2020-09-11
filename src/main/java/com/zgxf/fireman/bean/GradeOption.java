package com.zgxf.fireman.bean;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 配置表
 */
@Data
@Accessors(chain = true)
public class GradeOption {
    private Integer optionId;

    private String optionName;

    private String optionValue;

}