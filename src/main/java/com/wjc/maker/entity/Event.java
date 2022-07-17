package com.wjc.maker.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("event")
public class Event extends BaseDto{
    private String eventId;
    private String bizCode;
    private String ou;
    private String batchId;
}
