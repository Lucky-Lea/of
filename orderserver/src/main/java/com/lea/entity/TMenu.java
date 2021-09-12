package com.lea.entity;

import lombok.Data;

@Data
public class TMenu {
    private int id;
    private String name;
    private String price;
    private String flavor;
    private Type type;
}
