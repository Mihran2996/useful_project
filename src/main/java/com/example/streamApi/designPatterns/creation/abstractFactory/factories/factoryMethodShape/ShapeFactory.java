package com.example.streamApi.designPatterns.creation.abstractFactory.factories.factoryMethodShape;

import com.example.streamApi.designPatterns.creation.abstractFactory.AbstractFactory;


public class ShapeFactory implements AbstractFactory<Shape> {

    @Override
    public Shape create(String name) {
        if (name.equals("CIRCLE")) {
            return new Circle();
        } else if (name.equals("SQUARE")) {
            return new Square();
        } else {
            return new Rectangle();
        }
    }
}
