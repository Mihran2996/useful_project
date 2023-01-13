package com.example.streamApi.designPatterns.creation.factoryMethod;

public class ShapeFactoryDemo {
    public static void main(String[] args) {
        Shape square = new ShapeFactory().getShape("SQUARE");
        Shape circle = new ShapeFactory().getShape("CIRCLE");
        Shape rectangle = new ShapeFactory().getShape("RECTANGLE");

        square.draw();
        circle.draw();
        rectangle.draw();
    }
}
