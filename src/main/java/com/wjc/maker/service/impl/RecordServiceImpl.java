package com.wjc.maker.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjc.maker.entity.Record;
import com.wjc.maker.entity.Test;
import com.wjc.maker.mapper.RecordMapper;
import com.wjc.maker.mapper.TestMapper;
import com.wjc.maker.service.RecordService;
import com.wjc.maker.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl extends ServiceImpl<RecordMapper, Record> implements RecordService {
}
