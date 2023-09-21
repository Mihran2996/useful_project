package com.example.designPatterns.structure.composite;

public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Composite composite = new Composite();
        composite.addShape(circle);
        composite.addShape(rectangle);
        composite.draw();
    }
}
