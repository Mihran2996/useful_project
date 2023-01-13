package com.example.streamApi.MultiTherading;

public class Task extends Thread {
    @Override
    public void run() {
        System.out.println("It's Task class");
    }
}
