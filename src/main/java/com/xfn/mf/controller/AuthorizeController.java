package com.xfn.mf.controller;

import com.alibaba.fastjson.JSONObject;
import com.xfn.mf.bean.User;
import com.xfn.mf.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by po on 16/5/11.
 */
@Controller
@RequestMapping("/auth")
public class AuthorizeController {

    private IUserService userService;

    @RequestMapping(value = "/getUser.do")
    @ResponseBody
    public JSONObject getUser(String userid) {
        User user = new User();
        user = userService.getUser(userid);
        System.out.println(user.toJSONObject().toString());
        return user.toJSONObject();

    }

    @RequestMapping(value = "/getView.do")
    public String getView(){
        return "view";
    }


    @Resource
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
}