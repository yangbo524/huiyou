package com.huiyou.sup.common.bean.response;

import com.huiyou.sup.common.bean.Classes;
import com.huiyou.sup.common.bean.base.BaseResponse;
import lombok.Data;

import java.util.List;
@Data
public class ClassesResponse extends BaseResponse{

    private List<Classes> classeslist;

}
