package com.example.designPatterns.creation.abstractFactory;

import com.example.designPatterns.creation.abstractFactory.factories.factoryMethodColor.ColorFactory;
import com.example.designPatterns.creation.abstractFactory.factories.factoryMethodShape.ShapeFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String factoryName) {
        if (factoryName.equals("COLORFACTORY")) {
            return new ColorFactory();
        } else if (factoryName.equals("SHAPEFACTORY")) {
            return new ShapeFactory();
        } else {
            return null;
        }
    }
}
