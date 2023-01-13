package com.example.streamApi.designPatterns.structure.adapter;

public class ToyDogAdapter implements Toy {

    private Dog dog;

    public ToyDogAdapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void playSound() {
        dog.sound();
    }
}
