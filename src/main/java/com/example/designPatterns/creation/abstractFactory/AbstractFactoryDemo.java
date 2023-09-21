package com.example.designPatterns.creation.abstractFactory;

import com.example.designPatterns.creation.abstractFactory.factories.factoryMethodColor.Color;
import com.example.designPatterns.creation.abstractFactory.factories.factoryMethodColor.ColorFactory;
import com.example.designPatterns.creation.abstractFactory.factories.factoryMethodShape.Shape;
import com.example.designPatterns.creation.abstractFactory.factories.factoryMethodShape.ShapeFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {

        ColorFactory colorFactory = (ColorFactory) FactoryProvider.getFactory("COLORFACTORY");
        ShapeFactory shapeFactory = (ShapeFactory) FactoryProvider.getFactory("SHAPEFACTORY");

        Color white = colorFactory.create("WHITE");
        Color black = colorFactory.create("BLACK");
        Color red = colorFactory.create("RED");

        Shape circle = shapeFactory.create("CIRCLE");
        Shape rectangle = shapeFactory.create("RECTANGLE");
        Shape square = shapeFactory.create("SQUARE");

        white.print();
        red.print();
        black.print();
        System.out.println("--------------");
        circle.draw();
        rectangle.draw();
        square.draw();


    }
}
