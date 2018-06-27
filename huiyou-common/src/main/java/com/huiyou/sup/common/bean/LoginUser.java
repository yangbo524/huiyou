package com.huiyou.sup.common.bean;

import com.huiyou.sup.common.bean.base.BaseRequest;
import lombok.Data;

/**
 * 登录用户
 */
@Data
public class LoginUser extends BaseRequest{
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;

}
