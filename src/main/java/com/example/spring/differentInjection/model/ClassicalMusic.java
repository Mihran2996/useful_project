package com.example.spring.differentInjection.model;

public class ClassicalMusic implements Music {
    @Override
    public void song() {
        System.out.println("This is classical music");
    }
}
