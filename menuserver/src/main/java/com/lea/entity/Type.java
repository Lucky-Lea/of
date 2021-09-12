package com.lea.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "t_type")
public class Type {
    private int id;
    private String name;
}
