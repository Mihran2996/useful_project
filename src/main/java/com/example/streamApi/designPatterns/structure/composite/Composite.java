package com.example.streamApi.designPatterns.structure.composite;


import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {
    //COMPOSITE
    private List<Shape> shapeList = new ArrayList<>();

    @Override
    public void draw() {
        shapeList.forEach(Shape::draw);
    }

    public void addShape(Shape shape) {
        this.shapeList.add(shape);
    }

    public void removeShape(Shape shape) {
        this.shapeList.remove(shape);
    }
}
