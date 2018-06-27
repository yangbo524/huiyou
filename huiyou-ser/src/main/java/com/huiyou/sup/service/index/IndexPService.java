package com.huiyou.sup.service.index;

import com.huiyou.sup.common.bean.base.BaseResponse;

/**
 * 首页处理
 */
public interface IndexPService {
    /**
     * 大图推荐
     * @return
     */
    BaseResponse allMainProducts();

    /**
     * 所有精品推荐
     * @return
     */
    BaseResponse allBestProducts();
}
