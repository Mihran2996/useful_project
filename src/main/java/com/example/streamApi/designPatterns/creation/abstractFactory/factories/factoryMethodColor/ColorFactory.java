package com.example.streamApi.designPatterns.creation.abstractFactory.factories.factoryMethodColor;

import com.example.streamApi.designPatterns.creation.abstractFactory.AbstractFactory;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String name) {
        if (name.equals("WHITE")) {
            return new White();
        } else if (name.equals("RED")) {
            return new Red();
        } else {
            return new Black();
        }
    }

}
