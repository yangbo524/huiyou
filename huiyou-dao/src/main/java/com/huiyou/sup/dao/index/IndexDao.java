package com.huiyou.sup.dao.index;

import com.huiyou.sup.common.bean.Product;

import java.util.List;

public interface IndexDao {
    /**
     *获取
     * @return
     */
    List<Product> allMainProducts();

    /**
     *
     * @return
     */
    List<Product> allBestProducts();
}
