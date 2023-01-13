package com.example.streamApi.designPatterns.structure.bridge;

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Color is a Red!");
    }
}
