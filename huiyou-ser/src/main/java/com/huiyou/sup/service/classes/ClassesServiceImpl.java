package com.huiyou.sup.service.classes;

import com.huiyou.sup.common.bean.Classes;
import com.huiyou.sup.common.bean.base.BaseResponse;
import com.huiyou.sup.common.bean.response.ClassesResponse;
import com.huiyou.sup.dao.classes.ClassesDao;
import com.huiyou.sup.service.base.PlatformBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesServiceImpl extends PlatformBaseService implements ClassesService{

    @Autowired
    private ClassesDao classesDao;
    @Override
    public BaseResponse allClasse() {
        ClassesResponse baseResponse = new ClassesResponse();
        try{
            List<Classes> allClasses = classesDao.allClasses();
            baseResponse.setClasseslist(allClasses);
            baseResponse.setIsSuccess("Y");
        }catch (Exception e){
            e.printStackTrace();
            baseResponse.setIsSuccess("N");
            baseResponse.setFailReason("查询数据失败");
        }
        return baseResponse;
    }
}
