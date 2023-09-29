package com.example.designPatterns.creation.singleton;

public class LazySingleton {

    //It's a Lazy Singleton because the object initialize after getInstance() method call.
    //Initialize the instance as null.
    private static LazySingleton instance = null;

    //Private constructor, so it cannot be instantiated outside this class.
    private LazySingleton() {
    }

    //Check if the instance is null, and if so, create the object.
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
