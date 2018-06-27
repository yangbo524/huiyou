package com.huiyou.sup.common.bean.response;

import com.huiyou.sup.common.bean.Product;
import com.huiyou.sup.common.bean.base.BaseResponse;
import lombok.Data;

import java.util.List;

@Data
public class IndexResponse extends BaseResponse{

    private List<Product> productList;

}
