package com.wjc.maker.thread;

import cn.hutool.core.thread.ThreadUtil;

import java.util.concurrent.ExecutorService;

public class ThreadTest {
    /**
     * 初始化线程池，同时执行5个线程
     */
    private static ExecutorService executor = ThreadUtil.newExecutor(5);

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //执行线程（jdk1.8版本以上写法）
            executor.execute(() -> handler());
        }
        executor.shutdown();
        System.out.println("fin");
    }

    public static void handler() {
        //打印当前线程名字
        System.out.println("当前执行线程：" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
