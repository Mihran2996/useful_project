package com.example.streamApi.typofreferences;

import java.awt.*;

public class StrongReferences {

    //https://prateeknima.medium.com/strong-weak-soft-and-phantom-references-in-java-b4f9068e883e
    //

    //1.STRONG REFERENCES

    //This is the default type/class of Reference Object, if not differently specified: builder is a strong Reference Object.
    //This kind of reference makes the referenced object not eligible for GC.
    //That is, whenever an object is referenced by a chain of strong Reference Objects, it cannot be garbage collected.

    //These references are the one which we usually use in our day to day programming.
    //Any object which has Strong reference attached to it is not eligible for garbage collection.
    //Obviously these are objects which is needed by Java program

    public static void main(String[] args) throws AWTException {

        //By default it is a strong reference
        Robot rob = new Robot();
        //At this point the object is not eligible for GC
        rob = null;
        //At this point the object is eligible for garbage collection
        System.out.println(rob);
    }
}
