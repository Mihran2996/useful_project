package com.example.streamApi.map.weekhashmap;

import com.example.streamApi.comparatorAndComparable.ComparableExample.User;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Main {


    //https://www.geeksforgeeks.org/hashmap-vs-weakhashmap-java/

    //                                          STRONG REFERENCES

    //******************************************************************************************************************
    //The strong reference is the most common type of Reference that we use in our day to day programming:
    //The variable prime has a strong reference to an Integer object with value 1.
    //Any object which has a strong reference pointing to it is not eligible for GC.

    //Integer prime = 1;
    //******************************************************************************************************************

    //                                          SOFT REFERENCES

    //******************************************************************************************************************
    //Simply put, an object that has a SoftReference pointing to it won't be garbage collected until the JVM absolutely needs memory.

    //Integer prime = 1;
    //SoftReference<Integer> soft = new SoftReference<Integer>(prime);
    //prime = null;

    //The prime object has a strong reference pointing to it.
    //Next, we are wrapping prime strong reference into a soft reference.
    //After making that strong reference null, a prime object is eligible for GC but will be collected only when JVM absolutely needs memory.
    //******************************************************************************************************************

    //                                          WEAK REFERENCES

    //******************************************************************************************************************
    //The objects that are referenced only by weak references are garbage collected eagerly
    //the GC won't wait until it needs memory in that case.

    //Integer prime = 1;
    //WeakReference<Integer> soft = new WeakReference<Integer>(prime);
    //prime = null;

    //When we made a prime reference null, the prime object will be garbage collected in the next GC cycle,
    //as there is no other strong reference pointing to it.
    //******************************************************************************************************************


    //                                   WeakHashMap as an Efficient Memory Cache

    //******************************************************************************************************************

    //Let's say that we want to build a cache that keeps big image objects as values, and image names as keys.
    //We want to pick a proper map implementation for solving that problem.
    //Using a simple HashMap will not be a good choice because the value objects may occupy a lot of memory.
    //What's more, they'll never be reclaimed from the cache by a GC process, even when they are not in use in our application anymore.
    //***********************************************

    //***********************************************
    //deally, we want a Map implementation that allows GC to automatically delete unused objects.
    //When a key of a big image object is not in use in our application in any place, that entry will be deleted from memory.
    //***********************************************

    //***********************************************
    //Fortunately, the WeakHashMap has exactly these characteristics. Let's test our WeakHashMap and see how it behaves:
    //***********************************************

    public static void main(String[] args) throws InterruptedException {
        System.out.println("WeakHashMap working!");
        WeakHashMap<User, String> weakHashMap = new WeakHashMap<>();

        String valueWeak = "value";
        User keyWeak = new User(1, "poxos", "poxosyan");

        weakHashMap.put(keyWeak, valueWeak);
        System.out.println(weakHashMap.get(keyWeak));

        keyWeak = null;
        System.gc();

        Thread.sleep(3000);

        System.out.println(weakHashMap.isEmpty());
        System.out.println("----------------------------------");
        //***********************************************
        System.out.println("HashMap working!");

        Map<User, String> map = new HashMap<>();

        String value = "value";
        User key = new User(1, "poxos", "poxosyan");

        map.put(key, value);
        System.out.println(map.get(key));

        key = null;
        System.gc();

        Thread.sleep(3000);

        System.out.println(map.isEmpty());



    }


}
