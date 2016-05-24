package com.xfn.mf.controller;

import com.alibaba.fastjson.JSONObject;
import com.xfn.mf.bean.User;
import com.xfn.mf.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by po on 16/5/11.
 */
@Controller
@RequestMapping("/auth")
public class AuthorizeController {

    private UserService userService;

    @RequestMapping(value = "/getUser.do")
    @ResponseBody
    public JSONObject getUser(String userid) {
        User user = new User();
        user = userService.getUser(userid);
        System.out.println(user.toJSONObject().toString());
        return user.toJSONObject();

    }
    @RequestMapping(value = "/updateuser.do")
    @ResponseBody
    public JSONObject updateUser(String userid,String username) {

        int re = userService.updateUser(userid,username);
        System.out.println("共有"+re+"条数据修改");
        return null;

    }

    @RequestMapping(value = "/getView.do")
    public String getView(){
        return "view";
    }


    @RequestMapping(value = "/getcookie",method = RequestMethod.GET)
    public String getcookie(@CookieValue(value = "usrid",required = false) String usrid,
                            HttpServletResponse response){

//        System.out.println(usrid);
//        Cookie cookie = new Cookie("usrid",usrid);
//        cookie.setMaxAge(60*60*24*7);
//        response.addCookie(cookie);
        System.out.println("用户ID:"+usrid);

        return "jsp/view";
    }

    @RequestMapping(value = "/setcookie",method = RequestMethod.GET)
    @ResponseBody
    public String setcookie(@ModelAttribute("user") User user, HttpServletRequest request , HttpServletResponse response){

        System.out.println("用户ID:"+user.getUserid());
        Cookie cookie = new Cookie("usrid",user.getUserid());
        cookie.setMaxAge(60*60*24*7);
        response.addCookie(cookie);
        HttpSession session = request.getSession();
        session.setAttribute("usrid",user.getUserid());
        return user.getUserid();
    }


    @Resource
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}