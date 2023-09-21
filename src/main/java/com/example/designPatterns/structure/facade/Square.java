package com.example.designPatterns.structure.facade;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}
