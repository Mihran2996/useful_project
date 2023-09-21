package com.example.designPatterns.structure.bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.fill();
    }
}
