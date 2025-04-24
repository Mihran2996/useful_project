package com.collectionsframework.differenceBetween.vectorVSarraylist;

import java.util.Vector;

public class Main {

    //https://www.geeksforgeeks.org/vector-vs-arraylist-java/?ref=gcse

    //******************************************************************************************************************

    //                                                 VS

    //ARRAYLIST
    //is not synchronized.
    //ArrayList increments 50% of the current array.
    //ArrayList is not legacy class because it was introduced in 1.2 version
    //ArrayList works fast because it is not synchronized.
    //ArrayList uses the Iterator interface to traverse the elements.
    //ArrayList performance is high
    //Multiple threads is allowed

    //VECTOR
    //is synchronized.
    //Vector increments 100% means doubles the array size
    //Vector is a legacy class.
    //Vector performance is low
    //only one threads are allowed.
    //Vector is slow because it is synchronized, i.e., in a multithreading environment,
    //it holds the other threads in a runnable or non-runnable state until the current thread releases the lock of the object.
    //Vector can use the Iterator interface or Enumeration interface to traverse the elements

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.elements();//enumeration
        vector.iterator();//iterator
    }

    //******************************************************************************************************************

}
