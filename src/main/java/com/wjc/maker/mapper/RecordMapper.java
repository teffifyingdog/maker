package com.wjc.maker.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wjc.maker.entity.Record;
import com.wjc.maker.entity.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecordMapper extends BaseMapper<Record> {
}
