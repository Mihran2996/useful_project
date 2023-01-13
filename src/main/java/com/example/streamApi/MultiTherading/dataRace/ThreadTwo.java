package com.example.streamApi.MultiTherading.dataRace;

public class ThreadTwo implements Runnable {
    Example example;

    ThreadTwo(Example example) {
        this.example = example;
    }

    @Override
    public void run() {
        example.incrementInteger();
        example.getInteger();
    }
}
