package com.wjc.maker.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("user")
@Data
public class Test {
    private Integer id;
    private String extendInfo;
}
