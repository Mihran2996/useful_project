package com.example.streamApi.designPatterns.creation.factoryMethod;

public class ShapeFactory {

    public Shape getShape(String objectName) {
        if (objectName.equals("CIRCLE")) {
            return new Circle();
        } else if (objectName.equals("SQUARE")) {
            return new Square();
        } else {
            return new Rectangle();
        }
    }
}
