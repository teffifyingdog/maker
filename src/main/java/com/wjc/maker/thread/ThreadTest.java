package com.wjc.maker.thread;

import cn.hutool.core.thread.ThreadUtil;
import lombok.SneakyThrows;

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

class ThreadPrintDemo2 {
    public static void main(String[] args) {
        final ThreadPrintDemo2 demo2 = new ThreadPrintDemo2();
        Thread t1 = new Thread(demo2::print1);
        Thread t2 = new Thread(demo2::print2);
        t1.start();
        t2.start();
    }

    public synchronized void print1() {
        System.out.println(1);
        this.notify();
        try {
            this.wait();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(3);
        this.notify();
        try {
            this.wait();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void print2() {
        System.out.println(2);
        this.notify();
        try {
            this.wait();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(4);
        this.notify();
        try {
            this.wait();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}