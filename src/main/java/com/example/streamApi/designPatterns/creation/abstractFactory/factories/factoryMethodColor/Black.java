package com.example.streamApi.designPatterns.creation.abstractFactory.factories.factoryMethodColor;

public class Black implements Color{
    @Override
    public void print() {
        System.out.println("Black color");
    }
}
