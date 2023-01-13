package com.example.streamApi.designPatterns.creation.abstractFactory;

public interface AbstractFactory<T> {
    T create(String name);
}
