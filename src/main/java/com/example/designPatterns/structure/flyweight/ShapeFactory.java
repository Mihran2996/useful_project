package com.example.designPatterns.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String, Shape> shapeMap = new HashMap<>();


    public static Shape getShape(String color) {

        Shape shape = shapeMap.get(color);
        if (shape == null) {
            Circle circle = new Circle(color);
            shapeMap.put(color, circle);
            shape = circle;
        }
        return shape;
    }

    public static void showMapSize() {
        System.out.println(shapeMap.size());
    }
}
