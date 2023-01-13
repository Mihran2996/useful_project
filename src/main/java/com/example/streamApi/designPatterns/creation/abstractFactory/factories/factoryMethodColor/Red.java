package com.example.streamApi.designPatterns.creation.abstractFactory.factories.factoryMethodColor;

public class Red implements Color {
    @Override
    public void print() {
        System.out.println("Red color");
    }
}
