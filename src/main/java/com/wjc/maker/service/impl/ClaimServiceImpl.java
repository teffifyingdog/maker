package com.wjc.maker.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wjc.maker.entity.ClaimTraceRecordDO;
import com.wjc.maker.entity.Test;
import com.wjc.maker.mapper.ClaimMapper;
import com.wjc.maker.mapper.TestMapper;
import com.wjc.maker.service.ClaimService;
import com.wjc.maker.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 28600
 */
@Service
public class ClaimServiceImpl extends ServiceImpl<ClaimMapper, ClaimTraceRecordDO> implements ClaimService {
    @Autowired
    private ClaimMapper claimMapper;
    @Override
    public int updateByTraceId(ClaimTraceRecordDO claimTraceRecordDO) {
        return claimMapper.updateByTraceId(claimTraceRecordDO);
    }

    @Override
    public ClaimTraceRecordDO lockedByReceiptId(String receiptId) {
        return claimMapper.lockedByReceiptId(receiptId);
    }
}
