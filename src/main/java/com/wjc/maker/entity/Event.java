package com.wjc.maker.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName("event")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Event extends BaseDto{
    private String eventId;
    private String bizCode;
    private String ou;
    private String batchId;
}
