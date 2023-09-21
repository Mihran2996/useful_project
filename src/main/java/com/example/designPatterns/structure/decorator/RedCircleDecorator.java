package com.example.designPatterns.structure.decorator;

public class RedCircleDecorator extends CircleDecorator {

    public RedCircleDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Border Color: Red");
    }
}
