package com.example.designPatterns.structure.bridge;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Color is a Red!");
    }
}
