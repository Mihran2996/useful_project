package com.example.designPatterns.creation.abstractFactory.factories.factoryMethodShape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
