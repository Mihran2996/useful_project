package com.example.designPatterns.creation.singleton;

public class ThreadSafeSingleton {

    // initialize the instance as null.
    private static ThreadSafeSingleton instance = null;

    // private constructor, so it cannot be instantiated outside this class.
    private ThreadSafeSingleton() {
    }

    //ays method@ kazdi performance-i vra
    // check if the instance is null, within a synchronized block. If so, create the object
    public static ThreadSafeSingleton getInstanceUsingBadPerformance() {
        //estex performance kdandaxi  vorovhetev synchronized enq dardznum block@ ev heto stugum instance-i null linel@
        //ev karoxe instancen null chi aysinqn animasta stugel synchronized-i mej ,iranic araj petqe stugvi null chlinelu depqum return kani
        //hakarak depqum ete nulle nor texin cklini synchronized block@
        synchronized (ThreadSafeSingleton.class) {
            if (instance == null) {
                instance = new ThreadSafeSingleton();
            }
        }
        return instance;

    }


}
