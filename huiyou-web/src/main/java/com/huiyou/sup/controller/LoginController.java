package com.huiyou.sup.controller;

import com.huiyou.sup.common.bean.LoginUser;
import com.huiyou.sup.common.bean.base.BaseResponse;
import com.huiyou.sup.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;
    @RequestMapping(value = "/login/login", method = {RequestMethod.POST})
    @ResponseBody
    public BaseResponse login(HttpServletRequest request, HttpServletResponse response,LoginUser loginUser) {
        BaseResponse baseResponse = loginService.isLogin(loginUser, response);
        return baseResponse;
    }

    @RequestMapping(value = "/login/loginOut", method = {RequestMethod.POST})
    @ResponseBody
    public BaseResponse loginOut(HttpServletRequest request, HttpServletResponse response) {
        BaseResponse baseResponse = loginService.loginOut(response);
        return baseResponse;
    }

}
