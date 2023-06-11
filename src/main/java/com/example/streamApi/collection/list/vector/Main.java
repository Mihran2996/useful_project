package com.example.streamApi.collection.list.vector;


import java.util.Vector;

public class Main {

    //https://www.geeksforgeeks.org/java-util-vector-class-java/?ref=gcse

    //                                          BIG O COMPLEXITY IN ARRAYLIST

    //***************************************************
    //get(1) - GET method by index is always performed in constant time = Big O(1)
    //***************************************************
    //add(33) - ADD the element at the beginning of the array will be = Big O(n), because all elements to the right of index should move to the right
    //***************************************************
    //add(33) - ADD the element in the end of the array and there are free space the complexity will be = Big O(1)
    //***************************************************
    //add(44) - ADD the element at the end of the array and there aren't free space and hence it will be =  Big O(n)
    //needs to create new array, copy elements of old array into new array.
    //***************************************************
    //add() - ADD the element in the middle of array will be = Big O(n) because  all elements to the right of index should move to the right
    //***************************************************
    //remove(9)  - DELETE the element from end array will be Big O(1)
    //***************************************************
    //remove(4)  - DELETE the element in the middle of the array will be Big O(n), because all elements to the right of the index should move to the left
    //***************************************************
    //remove(0)  - DELETE the element at the beginning of the array will be Big O(n), because all elements to the right of the index should move to the left
    //******************************************************************************************************************

    //Default size is 10
    //The Vector class implements a growable array of objects.
    //Vector implements a dynamic array which means it can grow or shrink as required.
    //Like an array, it contains components that can be accessed using an integer index
    //They are very similar to ArrayList, but Vector is synchronized and has some legacy methods
    //that the collection framework does not contain.
    //It also maintains an insertion order like an ArrayList.
    //Still, it is rarely used in a non-thread environment as it is synchronized,
    //and due to this, it gives a poor performance in adding, searching, deleting, and updating its elements.
    //The Iterators returned by the Vector class are fail-fast. but he has enumeration
    //In the case of concurrent modification, it fails and throws the ConcurrentModificationException.

    //******************************************************************************************************************

    //WHY VECTOR IS DEPRECATED

    //BAD DESIGN
    //The major drawback of the Vector class is that it is synchronized but not completely thread-safe.
    //This is because Vector synchronizes on each operation and does not synchronize the whole Vector instance itself.
    //This is not desired in real-world applications, where the whole set of operations needs to be synchronized and not individual operations.
    //If one thread is iterating over the Vector and another thread modifies the Vector instance structurally,
    //the iterator will throw a ConcurrentModificationException.

    //******************************************************

    //PERFORMANCE

    //The Vector class combines two features – resizable-array and synchronization.
    //Therefore, it has the overhead of locking the operations whether synchronization is required or not, impacting the performance.

    //******************************************************

    //SUPPORTS ENUMERATIONS

    //Vector supports some legacy methods like elements(), which returns an enumeration of the components of the vector.
    //Programmers prefer using Iterator or ListIterator preferring Enumeration because:

    //The remove() method is not defined for Enumeration. That means the list cannot be structurally modified done during iteration.

    //Iterator has shorter method names – hasNext() and next(), as opposed to hasMoreElements() and nextElement() of Enumeration interface.

    //******************************************************************************************************************

    //ALTERNATIVES TO THE VECTOR CLASS

    //As per Java documentation of the Vector class, if a thread-safe implementation is not needed,
    //it is recommended to use ArrayList in place of Vector.

    //If a thread-safe implementation of List interface is required, we can either use CopyOnWriteArrayList class,
    //which is a thread-safe variant of the ArrayList or
    //synchronize ArrayList externally using the synchronizedList() method of the Collections class.

    //******************************************************************************************************************

}

