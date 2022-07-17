package com.wjc.maker.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BaseDto {
    private int id;
    private Date createTime;
    private Date updateTime;
}
