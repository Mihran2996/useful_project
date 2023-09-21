package com.example.designPatterns.creation.abstractFactory.factories.factoryMethodShape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}
