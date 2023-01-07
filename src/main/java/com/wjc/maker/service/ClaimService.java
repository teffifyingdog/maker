package com.wjc.maker.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wjc.maker.entity.ClaimTraceRecordDO;
import com.wjc.maker.entity.Test;

/**
 * @author 28600
 */
public interface ClaimService extends IService<ClaimTraceRecordDO>{
    int updateByTraceId(ClaimTraceRecordDO claimTraceRecordDO);

    ClaimTraceRecordDO lockedByReceiptId(String receiptId);
}
