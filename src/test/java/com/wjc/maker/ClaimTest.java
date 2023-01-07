package com.wjc.maker;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.wjc.maker.entity.ClaimTraceRecordDO;
import com.wjc.maker.entity.Record;
import com.wjc.maker.service.ClaimService;
import com.wjc.maker.service.RecordService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

@SpringBootTest
public class ClaimTest {
    @Autowired
    private ClaimService claimService;
    @Autowired
    private RecordService recordService;
    @Test
    public void t123(){
        recordService.save(new Record(){{
            setTitle("开票逆向大失败");
            setContext("1.2.3.");
            setStartTime(new Date());
            setEndTime(new Date());
            setPlace("ali");
        }});
    }
    @Test
    public void t1(){
        List<ClaimTraceRecordDO> list = claimService.list();
        list.forEach(claimTraceRecordDO -> {
            System.out.println("claim = " + claimTraceRecordDO);
            claimTraceRecordDO.setReceiptId("123123");
            int i = claimService.updateByTraceId(claimTraceRecordDO);
            System.out.println("i = " + i);
            ClaimTraceRecordDO cdo = claimService.lockedByReceiptId(claimTraceRecordDO.getReceiptId());
            System.out.println("cdo = " + cdo);
        });
    }
    @Test
    @Transactional
    @Rollback(value = false)
    public void t2(){
        ClaimTraceRecordDO recordDO = claimService.getOne(new QueryWrapper<ClaimTraceRecordDO>()
                .eq("trace_id","1"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("start");
        System.out.println("1 = "+scanner.next());
        recordDO.setAmount(BigDecimal.TEN);
        int i = claimService.updateByTraceId(recordDO);
        System.out.println("3 = "+scanner.next());
        ClaimTraceRecordDO claimTraceRecordDO = claimService.lockedByReceiptId("2");
        System.out.println("5 = "+scanner.next());
        System.out.println("end");
    }
    @Test
    @Transactional
    @Rollback(value = false)
    public void t3(){
        ClaimTraceRecordDO recordDO = claimService.getOne(new QueryWrapper<ClaimTraceRecordDO>()
                .eq("trace_id","2"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("start");
        System.out.println("2 = "+scanner.next());
        claimService.updateByTraceId(recordDO);
        System.out.println("4 = "+scanner.next());
        ClaimTraceRecordDO claimTraceRecordDO = claimService.lockedByReceiptId("1");
//        recordDO.setReceiptId("123");
//        recordDO.setVersion(recordDO.getVersion()+1);
        claimService.updateByTraceId(recordDO);
        System.out.println("6 = "+scanner.next());
        System.out.println("end");
    }
}
