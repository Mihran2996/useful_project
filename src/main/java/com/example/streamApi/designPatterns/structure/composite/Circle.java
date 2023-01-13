package com.example.streamApi.designPatterns.structure.composite;


public class Circle implements Shape {
    //LEAF
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
