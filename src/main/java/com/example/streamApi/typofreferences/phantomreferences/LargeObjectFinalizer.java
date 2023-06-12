package com.example.streamApi.typofreferences.phantomreferences;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class LargeObjectFinalizer extends PhantomReference<Object> {

    //Now, let's implement the second use case to practically figure out how this kind of references works.
    //First off, we need a subclass of the PhantomReference class to define a method for clearing resources:

    public LargeObjectFinalizer(Object referent, ReferenceQueue<? super Object> q) {
        super(referent, q);
    }

    public void finalizeResources() {
        // free resources
        System.out.println("clearing ...");
    }
}