package com.example.streamApi.designPatterns.creation.abstractFactory.factories.factoryMethodColor;

public class White implements Color{
    @Override
    public void print() {
        System.out.println("White color");
    }
}
