package com.example.streamApi.typofreferences;

import java.awt.*;
import java.lang.ref.SoftReference;

public class SoftReferences {

    //https://prateeknima.medium.com/strong-weak-soft-and-phantom-references-in-java-b4f9068e883e
    //https://codegym.cc/quests/lectures/questcollections.level04.lecture03

    //2.SOFT REFERENCES

    //Simply put, an object that has a SoftReference pointing to it won't be garbage collected until the JVM absolutely needs memory.
    //Soft references are similar to weak references except that they are only garbage collected when the JVM has an
    //extreme shortage of memory (Unlike weak references which are immediately available for garbage collection).

    public static void main(String[] args) throws AWTException {

        //By default it is a strong reference
        Robot rob = new Robot();
        SoftReference<Robot> softRef = new SoftReference<>(rob);
        rob = null;

        //The garbage collector won't remove object, it will remove only when the JVM has an extreme shortage of memory
        System.gc();

        // At this point the Robot object which was being pointed by
        //'rob' object is null but can be still be accessed using
        //'softRef' reference.

        //Both 'rob' as well as 'softRef' are eligible for GC but it
        //will only collected in the scenerio when JVM is in need of
        //memory.

        Robot rob2;
        //Accessing the object using softRef
        rob2 = softRef.get();
        System.out.println(rob2);
    }
}
