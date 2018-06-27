package com.huiyou.sup.common.bean.base;

import com.gome.mobile.common.utils.text.StringUtil;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse implements Serializable{

    private String isSuccess="Y";
    private String successMessage;
    private String failReason;
    private String failCode;
    private String serverTime;

    public String getIsSuccess() {
        if(StringUtil.notEmpty(this.failReason)) {
            this.isSuccess = "N";
        }

        if(StringUtil.isEmpty(this.failReason) && StringUtil.isEmpty(this.isSuccess)) {
            this.isSuccess = "Y";
        }

        return this.isSuccess;
    }
}
