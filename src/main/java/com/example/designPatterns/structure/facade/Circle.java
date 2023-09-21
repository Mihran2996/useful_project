package com.example.designPatterns.structure.facade;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
