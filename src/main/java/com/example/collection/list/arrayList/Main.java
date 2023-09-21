package com.example.collection.list.arrayList;

public class Main {


    //https://www.geeksforgeeks.org/arraylist-in-java/

    //*****************************************************************************************************************************************************

    //Java ArrayList is a part of the Java collection framework and it is a class of java.util package.It provides us with dynamic arrays in Java.
    //Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.
    //This class is found in java.util package. The main advantages of Java ArrayList are,
    //if we declare an array then it’s needed to mention the size but in ArrayList,
    //it is not needed to mention the size of ArrayList if you want to mention the size then you can do it.

    //*****************************************************************************************************************************************************

    //https://medium.com/@mckenziefiege/arrays-linked-lists-and-big-o-notation-486727b6259b

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
    //***************************************************

    //*****************************************************************************************************************************************************

    //                       IMPORTANT FEATURES OF ARRAYLIST IN JAVA

    //ArrayList inherits AbstractList class and implements the List interface.
    //ArrayList is initialized by size. However, the size is increased automatically if the collection grows or shrinks if the objects are removed from the collection.
    //Java ArrayList allows us to randomly access the list.
    //ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases.
    //ArrayList in Java can be seen as a vector in C++.
    //ArrayList is not Synchronized. Its equivalent synchronized class in Java is Vector.

    //*****************************************************************************************************************************************************


}
