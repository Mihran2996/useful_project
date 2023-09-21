package com.example.designPatterns.creation.abstractFactory;

public interface AbstractFactory<T> {
    T create(String name);
}
