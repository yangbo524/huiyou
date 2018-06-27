package com.huiyou.sup.controller;

import com.huiyou.sup.common.bean.base.BaseResponse;
import com.huiyou.sup.service.classes.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ClassController {

    @Autowired
    private ClassesService classesService;

    @RequestMapping(value = "/classes/all", method = {RequestMethod.GET})
    @ResponseBody
    public BaseResponse allClasses(HttpServletRequest request, HttpServletResponse response){
        BaseResponse baseResponse = classesService.allClasse();
        return baseResponse;
    }

}
