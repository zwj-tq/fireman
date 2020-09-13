package com.zgxf.fireman.controller;

import com.zgxf.fireman.bean.GradeUser;
import com.zgxf.fireman.service.GradeUserService;
import com.zgxf.fireman.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    public ResultData userLogin(@RequestParam Map<String,Object> params,HttpSession session){
        try{
            Integer username = new Integer( (String) params.get("username"));
            String password = (String) params.get("password");
            boolean pwd_is_correct = gradeUserService.verify(username, password);
            System.out.println(session.getAttribute("user"));
            session.setAttribute("user","1");
            ResultData data = ResultData.success();
            if(pwd_is_correct){
                data.setMsg("登录成功");
                resultDataAdd(data, gradeUserService.getUserByUId(username));
            } else{
                data.setMsg("登录失败");
            }
            return data;
        }catch (Exception e){
            return ResultData.failure().setMsg(e.getMessage());
        }

    }

    @PostMapping("/user/modify")
    public ResultData userModify(GradeUser user){
        try{
            ResultData resultData=ResultData.success();
            if(gradeUserService.updateUserById(user)){
                return resultData.setMsg("修改成功");
            }else{
                return resultData.setMsg("修改失败");
            }
        }catch (Exception e){
            return ResultData.failure().setMsg(e.getMessage());
        }
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
