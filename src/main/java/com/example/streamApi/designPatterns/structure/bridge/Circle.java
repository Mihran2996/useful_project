package com.example.streamApi.designPatterns.structure.bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.fill();
    }
}
