package com.example.streamApi.typofreferences.phantomreferences;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;

public class PhantomReferences {

    //https://prateeknima.medium.com/strong-weak-soft-and-phantom-references-in-java-b4f9068e883e
    //https://codegym.cc/groups/posts/213-features-of-phantomreference
    //https://www.baeldung.com/java-phantom-reference

    //4. PHANTOM REFERENCES

    //Phantom references have two major differences from soft and weak references
    //We can't get a referent of a phantom reference. The referent is never accessible directly through the API
    //and this is why we need a reference queue to work with this type of references.

    //The Garbage Collector adds a phantom reference to a reference queue after the finalize method of its referent is executed.
    //It implies that the instance is still in the memory.

    //******************************************************************************************************************

    //Now we're going to write an enhanced fine-grained finalization:

    public static void main(String[] args) {
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        List<LargeObjectFinalizer> references = new ArrayList<>();
        List<Object> largeObjects = new ArrayList<>();

        for (int i = 0; i < 10; ++i) {
            Object largeObject = new Object();
            largeObjects.add(largeObject);
            references.add(new LargeObjectFinalizer(largeObject, referenceQueue));
        }

        largeObjects = null;
        System.gc();

        Reference<?> referenceFromQueue;
        for (PhantomReference<Object> reference : references) {
            System.out.println(reference.isEnqueued());
        }

        while ((referenceFromQueue = referenceQueue.poll()) != null) {
            ((LargeObjectFinalizer)referenceFromQueue).finalizeResources();
            referenceFromQueue.clear();
        }
    }

}
