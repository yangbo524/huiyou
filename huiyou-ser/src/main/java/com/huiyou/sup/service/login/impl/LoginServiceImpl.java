package com.huiyou.sup.service.login.impl;

import com.huiyou.sup.common.bean.base.BaseResponse;
import com.huiyou.sup.dao.login.LoginDao;
import com.huiyou.sup.common.bean.LoginUser;
import com.huiyou.sup.service.base.PlatformBaseService;
import com.huiyou.sup.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@Service
public class LoginServiceImpl extends PlatformBaseService implements LoginService{

    @Autowired
    private LoginDao loginDao;

    @Override
    public BaseResponse isLogin(LoginUser request, HttpServletResponse responseH) {
        BaseResponse baseResponse = new BaseResponse();
        String loginName = request.getUserName();
        String password = request.getPassword();
        if(StringUtils.isEmpty(loginName) || StringUtils.isEmpty(password)){
            processFailResponse(baseResponse,"1001","用户名或密码为空");
            return baseResponse;
        }
        HashMap loginMap = new HashMap();
        loginMap.put("username",loginName);
        loginMap.put("password",password);
        int count = loginDao.selectLogin(loginMap);
        if(count > 0){
            baseResponse.setIsSuccess("Y");
            baseResponse.setSuccessMessage("登录成功");
        }else{
            processFailResponse(baseResponse,"1002","用户名密码错误");
        }
        return baseResponse;
    }

    @Override
    public BaseResponse loginOut(HttpServletResponse responseH) {
        BaseResponse baseResponse = new BaseResponse();

        return baseResponse;
    }
}
