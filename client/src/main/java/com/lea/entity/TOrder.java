package com.lea.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TOrder {
    private int id;
    private TUser user;
    private TMenu menu;
    private TAdmin admin;
    private Date date;
    private int state;
}
