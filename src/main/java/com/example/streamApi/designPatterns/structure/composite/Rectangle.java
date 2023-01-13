package com.example.streamApi.designPatterns.structure.composite;


public class Rectangle implements Shape {
    //LEAF
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}
