package com.example.streamApi.designPatterns.structure.decorator;

public abstract class CircleDecorator implements Shape {

    protected Shape shape;

    public CircleDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }
}