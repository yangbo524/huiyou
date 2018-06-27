package com.huiyou.sup.common.bean;

import lombok.Data;

import java.util.List;

/**
 * 类别
 */

@Data
public class Classes {

    private String classCode;
    private String classItemName;
    private List<SubClasses> subClassesList;

}
