package com.wjc.maker.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 28600
 */
@Data
@TableName("ar_claim_trace_record")
public class ClaimTraceRecordDO {
    private int id;
    private Date gmtCreate;
    private Date gmtModified;
    private String traceId;
    private String requestId;
    private String journalId;
    private String claimReceiptNo;
    private BigDecimal amount;
    private String receiptId;
    private String applyStatus;
    private String claimRequest;
    private String claimEmpId;
    private Date claimTime;
    private String claimSummary;
    private Date cancelClaimTime;
    private String cancelClaimEmpId;
    private String claimDeliverStatus;
    private String cancelClaimDeliverStatus;
    private int version;
    private String finalClaimOperator;
    private String claimNickName;
    private String cancelClaimNickName;
    private String claimType;
    private String receivableDraftId;
    private String bizCode;
}
