package com.example.typofreferences;

import com.example.comparatorAndComparable.ComparableExample.User;

import java.lang.ref.WeakReference;

public class WeakReferences {

    //https://prateeknima.medium.com/strong-weak-soft-and-phantom-references-in-java-b4f9068e883e

    //3.WEAK REFERENCES

    //The objects that are referenced only by weak references are garbage collected eagerly; the GC won't wait until it needs memory in that case.
    //A weak reference, simply put, is a reference that isn't strong enough to force an object to remain in memory.
    //An object kept from death only by a WeakReference won't survive the next garbage collection


    public static void main(String[] args) throws InterruptedException {
        // Create innerObject reference points to AnyObject("Obj1").
        User innerObject = new User(1,"name","surname");

        // Create WeakReference object using innerObject reference.
        WeakReference<User> weakRef = new WeakReference<User>(innerObject);

        System.out.println("weakRef.get(): " + weakRef.get());

        int i =0;
        while (weakRef.get()!=null){
            System.out.println(i+" : " +weakRef.get());
            i++;
        }
        System.out.println("weakRef.get(): " + weakRef.get());

    }
}
