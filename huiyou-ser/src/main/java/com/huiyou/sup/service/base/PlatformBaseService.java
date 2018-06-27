package com.huiyou.sup.service.base;

import com.huiyou.sup.common.bean.base.BaseResponse;


public class PlatformBaseService {

    protected BaseResponse processFailResponse(BaseResponse responseBean,
                                               String failCode, String failReason) {

        if (null == responseBean) {
            responseBean = new BaseResponse();
        }
        responseBean.setIsSuccess("N");
        responseBean.setFailCode(failCode);
        responseBean.setFailReason(failReason);
        return responseBean;
    }


}
