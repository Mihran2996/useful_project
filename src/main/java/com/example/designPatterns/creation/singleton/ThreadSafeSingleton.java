package com.example.designPatterns.creation.singleton;

public class ThreadSafeSingleton {

    // initialize the instance as null.
    private static ThreadSafeSingleton instance = null;

    // private constructor, so it cannot be instantiated outside this class.
    private ThreadSafeSingleton() {
    }

    //Check if the instance is null, within a synchronized block. If so, create the object
    //This method affects to performance, because we don't check for a null instance before defining synchronized block.
    //And since the instance can not be a null, hence we create synchronized block before null check pointless.
    public static ThreadSafeSingleton getInstanceUsingBadPerformance() {
        synchronized (ThreadSafeSingleton.class) {
            if (instance == null) {
                instance = new ThreadSafeSingleton();
            }
        }
        return instance;

    }

    //It is good case, checking for a null instance before defining synchronized block
    public static ThreadSafeSingleton getInstanceUsingGoodPerformance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                return new ThreadSafeSingleton();
            }
        }
        return instance;
    }

}
