package com.lea.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import lombok.Data;

@Data
public class TMenu {
    private int id;
    private String name;
    private String price;
    private String flavor;
    @TableField(exist = false)
    private Type type;
}
