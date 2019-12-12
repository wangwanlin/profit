package com.controller;/**
 * Created by hand on 2017/7/8.
 */

import com.dto.User;
import com.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: wanlin.wang
 * Date: 2017/7/8 10:39
 * Description:
 */
@Controller
public class Login {
    @Autowired
    private ILoginService service;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    //接收请求参数,检查正确性
    @RequestMapping("/login.form")
    public ModelAndView checkLogin(
            HttpServletRequest request,  User user) throws Exception{
        String name = user.getUsername();
        String password = user.getPassword();
        int a = service.ifExists(user);
        ModelAndView mav = new ModelAndView();
        if(a==1){
            mav.setViewName("ok");//进入ok.jsp
            mav.getModel().put("user", name);//存入request
        }else{
            mav.setViewName("login");//进入login.jsp
            mav.getModel().put("error", "用户名或密码错误");
        }
        return mav;
    }
}
