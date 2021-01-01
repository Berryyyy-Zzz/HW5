package com.example.controller;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.User;
import com.example.service.UserService;
import com.example.util.Result;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	@ResponseBody
    public Result login(User user, HttpServletResponse response) throws Exception{
        Result result = new Result();
        User u = userService.login(user);
        if(u!=null){
        	Cookie cookie1 = new Cookie("username",URLEncoder.encode(u.getUsername(), "utf-8"));
        	Cookie cookie2 = new Cookie("id",URLEncoder.encode(u.getId()+"", "utf-8"));
        	Cookie cookie3 = new Cookie("headshot",URLEncoder.encode(u.getHeadshot(), "utf-8"));
        	cookie1.setPath("/");
        	cookie2.setPath("/");
        	cookie3.setPath("/");
            result.setResult("success");
            result.setMessage("登录成功！");
            response.addCookie(cookie1);
            response.addCookie(cookie2);
            response.addCookie(cookie3);
        }else {
            result.setResult("error");
            result.setMessage("登录失败，账号密码错误或用户不存在！");
        }
            return result;
    }   
	@RequestMapping("/register")
    @ResponseBody
    public Result register(User user) throws Exception{
        Result result = new Result();
        if(userService.register(user)==1){
            result.setResult("success");
            result.setMessage("注册成功！返回登录页面");
        }else {
            result.setResult("error");
            result.setMessage("注册失败，请重试！");
        }
        return result;
    }
	@RequestMapping("/findUser")
	@ResponseBody
	public User findUser(int id) throws Exception{
		User u = userService.findUser(id);
		return u;
	}
}
