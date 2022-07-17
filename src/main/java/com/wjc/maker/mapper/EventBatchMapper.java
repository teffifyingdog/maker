package com.wjc.maker.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wjc.maker.entity.EventBatch;
import com.wjc.maker.entity.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EventBatchMapper extends BaseMapper<EventBatch> {
}
