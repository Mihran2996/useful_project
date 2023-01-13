package com.example.streamApi.MultiTherading;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("It's is Callable");
        return new Object();
    }
}
