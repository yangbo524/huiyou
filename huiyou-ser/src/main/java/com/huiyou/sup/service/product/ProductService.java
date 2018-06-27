package com.huiyou.sup.service.product;

import com.huiyou.sup.common.bean.Product;

/**
 * 商品处理
 */
public interface ProductService {
    /**
     * 获取商品详情
     * @param productCode
     * @return
     */
    Product getProductDetail(String productCode);

}
