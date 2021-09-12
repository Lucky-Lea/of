package com.lea.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserVO {
    private int code;
    private String msg;
    private int count;
    private List<TUser> data;
}
