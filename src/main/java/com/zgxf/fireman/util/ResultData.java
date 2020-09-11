package com.zgxf.fireman.util;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据封装类
 * @author 范颂扬
 * @create 2020-08-23 15:25
 */
@Data
@Accessors(chain = true)
public class ResultData {

    /**
     * 状态码：100-成功  200-失败
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private Map<String, Object> extend = new HashMap<>();

    /**
     * 获取请求成功信息的封装类
     */
    public static ResultData success() {
        ResultData resultData = new ResultData().setCode(100).setMsg("请求成功");
        return resultData;
    }

    /**
     * 获取请求失败信息的封装类
     */
    public static ResultData failure() {
        ResultData resultData = new ResultData().setCode(200).setMsg("请求失败");
        return resultData;
    }

    /**
     * 添加返回数据
     */
    public ResultData addExtend(String key, Object value) {
        this.getExtend().put(key, value);
        return this;
    }
}
