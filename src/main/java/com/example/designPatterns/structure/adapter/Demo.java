package com.example.designPatterns.structure.adapter;

public class Demo {
    public static void main(String[] args) {
        //shun@ irakan karoxe hachal
        Dog realDog = new RealDog();
        //xaxaliqic shun@ chi karox irakan hachal
        Toy toyDog = new ToyDok();
        //adapteri ognutyamb xaxaliq@ karoxa irakan hachal
        Toy toyDogAdapter = new ToyDogAdapter(realDog);

        realDog.sound();
        toyDog.playSound();
        toyDogAdapter.playSound();

    }
}
