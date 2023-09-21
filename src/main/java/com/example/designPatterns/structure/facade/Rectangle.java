package com.example.designPatterns.structure.facade;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}
