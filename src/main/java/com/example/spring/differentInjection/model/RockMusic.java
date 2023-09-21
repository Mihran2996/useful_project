package com.example.spring.differentInjection.model;

public class RockMusic implements Music {
    @Override
    public void song() {
        System.out.println("This is rock music");
    }
}
