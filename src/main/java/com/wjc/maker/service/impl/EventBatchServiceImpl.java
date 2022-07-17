package com.wjc.maker.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjc.maker.entity.EventBatch;
import com.wjc.maker.entity.Test;
import com.wjc.maker.mapper.EventBatchMapper;
import com.wjc.maker.mapper.TestMapper;
import com.wjc.maker.service.EventBatchService;
import com.wjc.maker.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class EventBatchServiceImpl extends ServiceImpl<EventBatchMapper, EventBatch> implements EventBatchService {
}
