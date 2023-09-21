package com.example.designPatterns.structure.bridge;

public class Demo {

    public static void main(String[] args) {
        Circle circleRed = new Circle(new Red());
        Circle circleBlue = new Circle(new Blue());

        circleRed.draw();
        circleBlue.draw();
    }


}
