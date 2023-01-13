package com.example.streamApi.designPatterns.creation.abstractFactory.factories.factoryMethodShape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}
