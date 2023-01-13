package com.example.streamApi.designPatterns.structure.adapter;

public class RealDog implements Dog{
    @Override
    public void sound() {
        System.out.println("Gaf-Gaf!");
    }
}
