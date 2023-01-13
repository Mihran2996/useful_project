package com.example.streamApi.designPatterns.structure.decorator;


public class Demo {

    public static void main(String[] args) {
        Shape circle = new Circle();

        circle.draw();
        System.out.println();

        Shape circleDecorator = new RedCircleDecorator(circle);

        circleDecorator.draw();
    }
}
