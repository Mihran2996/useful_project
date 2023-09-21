package com.example.MultiTherading.dataRace;

public class ThreadOne implements Runnable {
    Example example;

    ThreadOne(Example example) {
        this.example = example;
    }

    @Override
    public void run() {
        System.out.println("Thread--1");
        example.incrementInteger();
        example.getInteger();
    }
}
