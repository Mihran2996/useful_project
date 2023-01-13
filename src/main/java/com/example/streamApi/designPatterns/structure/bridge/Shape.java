package com.example.streamApi.designPatterns.structure.bridge;

public abstract class Shape {

    //Bridge pattern@ arandznacnume abstrakcian ir realizaciayic
    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
