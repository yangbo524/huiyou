package com.huiyou.sup.common.bean;

import com.huiyou.sup.common.bean.base.BaseResponse;
import lombok.Data;

@Data
public class Product extends BaseResponse{

    private String productCode;
    private String productName;
    private String classCode;
    private String imgUrl;
    private double price;

}
