package com.example.MultiTherading.dataRace;

public class ThreadTwo implements Runnable {
    Example example;

    ThreadTwo(Example example) {
        this.example = example;
    }

    @Override
    public void run() {
        System.out.println("Thread--2");
        example.incrementInteger();
        example.getInteger();
    }
}
