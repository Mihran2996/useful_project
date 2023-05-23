package com.example.streamApi.MultiTherading.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable {

    private int delay;
    private String name;
    private CountDownLatch countDownLatch;

    public Worker(int delay, String name, CountDownLatch countDownLatch) {
        this.delay = delay;
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
            //countDown method@ count@ (ventneri qanak@ dencrementa anum)
            countDownLatch.countDown();
            System.out.println(this.name + " finished!!!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
