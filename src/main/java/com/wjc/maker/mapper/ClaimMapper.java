package com.wjc.maker.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wjc.maker.entity.ClaimTraceRecordDO;
import com.wjc.maker.entity.Test;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 28600
 */
@Mapper
public interface ClaimMapper extends BaseMapper<ClaimTraceRecordDO> {
    int updateByTraceId(ClaimTraceRecordDO claimTraceRecordDO);

    ClaimTraceRecordDO lockedByReceiptId(String receiptId);
}
