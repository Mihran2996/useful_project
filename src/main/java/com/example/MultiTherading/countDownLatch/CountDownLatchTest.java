package com.example.MultiTherading.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {


    //erbemn mez petqen vor thread@ start lini inj vor event-i start lineluc heto,spasi minjev event@ katarvi hetonstart lini
    public static void main(String[] args) throws InterruptedException {
        //4-@ da eventneri qanakne
        //orinak ete tiv@ tanq 5, bayc 4 angam kanchenq start@
        //apa count@ kmna verjum 1, ev Main thread@ misht kmna waiting state um
        CountDownLatch countDownLatch = new CountDownLatch(4);

        Thread first = new Thread(new Worker(1000, "Worker-1", countDownLatch));
        Thread second = new Thread(new Worker(2000, "Worker-2", countDownLatch));
        Thread third = new Thread(new Worker(3000, "Worker-3", countDownLatch));
        Thread fourth = new Thread(new Worker(4000, "Worker-4", countDownLatch));

        first.start();
        second.start();
        third.start();
        fourth.start();

        //ays method@ glxavor thread@ qcume blocki mej
        //ev khani ayn depqum erb count@ havasar lini 0-i;
        countDownLatch.await();

        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " finished!!!");

    }
}
