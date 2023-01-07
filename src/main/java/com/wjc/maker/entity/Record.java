package com.wjc.maker.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName("record")
@Data
public class Record extends BaseEntity{
    private String title;
    private String Context;
    private Integer tagId;
    private Date startTime;
    private Date endTime;
    private String place;
}
