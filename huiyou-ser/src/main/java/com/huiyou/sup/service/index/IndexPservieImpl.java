package com.huiyou.sup.service.index;

import com.huiyou.sup.common.bean.Product;
import com.huiyou.sup.common.bean.base.BaseResponse;
import com.huiyou.sup.common.bean.response.IndexResponse;
import com.huiyou.sup.dao.index.IndexDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexPservieImpl implements IndexPService {

    @Autowired
    private IndexDao indexDao;
    @Override
    public BaseResponse allMainProducts() {
        IndexResponse baseResponse = new IndexResponse();
        try{
            List<Product> allMainProducts = indexDao.allMainProducts();
            baseResponse.setProductList(allMainProducts);
            baseResponse.setIsSuccess("Y");
        }catch (Exception e){
            e.printStackTrace();
            baseResponse.setIsSuccess("N");
            baseResponse.setFailReason("查询数据失败");
        }
        return baseResponse;
    }

    @Override
    public BaseResponse allBestProducts() {
        IndexResponse baseResponse = new IndexResponse();
        try{
            List<Product> allBestProducts = indexDao.allBestProducts();
            baseResponse.setProductList(allBestProducts);
            baseResponse.setIsSuccess("Y");
        }catch (Exception e){
            e.printStackTrace();
            baseResponse.setIsSuccess("N");
            baseResponse.setFailReason("查询数据失败");
        }
        return baseResponse;
    }
}
