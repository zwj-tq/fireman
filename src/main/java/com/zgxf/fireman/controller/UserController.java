package com.zgxf.fireman.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zgxf.fireman.bean.GradeUser;
import com.zgxf.fireman.service.GradeUserService;
import com.zgxf.fireman.service.impl.GradeUserServiceImpl;
import com.zgxf.fireman.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author 范颂扬
 * @create 2020-09-09 20:06
 */
@RestController
public class UserController {

    @Autowired
    private GradeUserService gradeUserService;

    @PostMapping("/user/login")
    public ResultData userLogin(@RequestParam Map<String,Object> params){
        Integer username = new Integer( (String) params.get("username"));
        String password = (String) params.get("password");
        boolean pwd_is_correct = gradeUserService.verify(username, password);
        ResultData data;
        if(pwd_is_correct){
            data = ResultData.success();
            resultDataAdd(data, gradeUserService.getUserByUId(username));
        } else{
            data = ResultData.failure();
        }
        return data;
    }

    public void resultDataAdd(ResultData data, GradeUser user){
        data.addExtend("id", user.getUid());
        data.addExtend("is_admin", user.getIsAdmin());
        data.addExtend("username", user.getIsAdmin());
        data.addExtend("password", user.getIsAdmin());
        data.addExtend("career", user.getIsAdmin());
        data.addExtend("sex", user.getIsAdmin());
        data.addExtend("age", user.getIsAdmin());

    }
}
