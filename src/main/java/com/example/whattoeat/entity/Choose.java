package com.example.whattoeat.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author liutao29
 * @Date 2022/9/13
 * @Description 选择实体类
 **/

@Data
public class Choose implements Serializable {

    private static final long serialVersionUID = 702473271304242715L;

    /**主键id**/
    private String id;
    /**名称**/
    private String name;
}
