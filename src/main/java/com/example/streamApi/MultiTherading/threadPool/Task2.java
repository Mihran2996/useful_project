package com.example.streamApi.MultiTherading.threadPool;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Task2 implements Runnable {
    private String name;
    private AtomicInteger i = new AtomicInteger(0);

    public Task2(String s) {
        name = s;
    }

    // Prints task name and sleeps for 1s
    // This Whole process is repeated 5 times
    public void run() {
        try {
            Date d = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
            System.out.println("Initialization Time for"
                    + " task name - " + name + " = " + ft.format(d));
            Thread.sleep(1000);
            System.out.println(name + " complete");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
