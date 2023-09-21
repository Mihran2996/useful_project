package com.example.designPatterns.structure.bridge;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Color is a Blue!");
    }
}
