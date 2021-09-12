package com.lea.entity;

import lombok.Data;

import java.util.List;

@Data
public class OrderVO {
    private int code;
    private String msg;
    private int count;
    private List<TOrder> data;
}
