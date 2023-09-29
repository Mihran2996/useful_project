package com.example.designPatterns.creation.singleton;

public class EagerSingleton {


    //It's an Eager Singleton, it will initialize when the  Classloader loads the class since it is static variable,
    //And there is a case when this object won't be using during application running.
    //Therefore, we create an object pointless.
    //Create an instance of the class.
    private static EagerSingleton instance = new EagerSingleton();

    //Private constructor, so it cannot be instantiated outside this class.
    private EagerSingleton() {
    }

    //Get the only instance of the object created.
    public static EagerSingleton getInstance() {
        return instance;
    }
}
