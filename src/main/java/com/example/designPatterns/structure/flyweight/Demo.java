package com.example.designPatterns.structure.flyweight;

public class Demo {
    public static void main(String[] args) {

        Shape red = ShapeFactory.getShape("red");
        Shape red2 = ShapeFactory.getShape("red");
        Shape green = ShapeFactory.getShape("green");
        Shape green2 = ShapeFactory.getShape("green");
        Shape green3 = ShapeFactory.getShape("green");
        Shape green4 = ShapeFactory.getShape("green");
        Shape blue = ShapeFactory.getShape("blue");
        Shape blue2 = ShapeFactory.getShape("blue");
        Shape blue3 = ShapeFactory.getShape("blue");
        Shape blue4 = ShapeFactory.getShape("blue");

        red.draw();
        red2.draw();
        green.draw();
        green2.draw();
        green3.draw();
        green4.draw();
        blue.draw();
        blue2.draw();
        blue3.draw();
        blue4.draw();


        ShapeFactory.showMapSize();

    }
}
