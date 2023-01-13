package com.example.streamApi.designPatterns.creation.singleton;

public class EagerSingleton {


    // create an instance of the class.
    // EagerSingleton - i object@ ksarqvi erb ClassLoader@ load kani class@ qani vor static e
    //ev hnaravore vor ays object@ application-i runi jamanak @ndhanrapes chogtagorcvi
    //aysinqn klini vor Eager singletone vorovhetev object@ chi inicializacvum methodi kanchov
    private static EagerSingleton instance = new EagerSingleton();

    // private constructor, so it cannot be instantiated outside this class.
    private EagerSingleton() {
    }

    // get the only instance of the object created.
    public static EagerSingleton getInstance() {
        return instance;
    }
}
