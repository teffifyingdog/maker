package com.wjc.maker;

import com.wjc.maker.entity.Event;
import com.wjc.maker.entity.EventBatch;
import com.wjc.maker.service.EventBatchService;
import com.wjc.maker.service.EventService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootTest
public class EventTest {
    @Autowired
    private EventBatchService eventBatchService;
    @Autowired
    private EventService eventService;

    ExecutorService executorService = Executors.newCachedThreadPool();
    private static String[] bizCodes;
    private static String[] ous;

    static {
        int a = 1;
        ous = new String[a];
        bizCodes = new String[a];
        for (int i = 0; i < a; i++) {
            ous[i] = "O" + i;
            bizCodes[i] = "B" + i;
        }
    }

    public static void main(String[] args) {
        int a = (int) (Math.random() * bizCodes.length);
        int b = (int) Math.random() * ous.length;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        String bizCode = bizCodes[a];
        String ou = ous[b];
        System.out.println("ou = " + ou);
        System.out.println("bizCode = " + bizCode);
    }

    @Test
    public void t2() throws InterruptedException {
        for (int i = 0; i < 2000000; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    t1();
                }
            });
            Thread.sleep(50);
        }
        Thread.sleep(10000000000L);
    }

    @Test
    public void t1() {

    }
}
