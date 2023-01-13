package com.example.streamApi.designPatterns.structure.adapter;

public class ToyDok implements Toy {

    @Override
    public void playSound() {
        System.out.println("It's a ToyDog!");
    }
}
