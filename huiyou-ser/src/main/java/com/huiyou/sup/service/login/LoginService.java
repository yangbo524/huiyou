package com.huiyou.sup.service.login;

import com.huiyou.sup.common.bean.LoginUser;
import com.huiyou.sup.common.bean.base.BaseResponse;

import javax.servlet.http.HttpServletResponse;

public interface LoginService {

      BaseResponse isLogin(LoginUser request, HttpServletResponse responseH);
      BaseResponse loginOut(HttpServletResponse responseH);
}
