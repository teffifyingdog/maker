package com.wjc.maker.entity;

import lombok.Data;

@Data
public class EventBatch extends BaseDto{
    private String batchId;
    private String bizCode;
    private String ou;
}
