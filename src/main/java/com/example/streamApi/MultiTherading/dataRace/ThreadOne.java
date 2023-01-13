package com.example.streamApi.MultiTherading.dataRace;

public class ThreadOne implements Runnable {
    Example example;

    ThreadOne(Example example) {
        this.example = example;
    }

    @Override
    public void run() {
        example.incrementInteger();
        example.getInteger();
    }
}
