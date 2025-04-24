package com.collectionsframework.differenceBetween.iteratorVSenumeration;

public class Main {

    //https://www.tutorialspoint.com/difference-between-iterator-and-enumeration-in-java
    //What is the difference between Iterator and Enumeration?

    //Iterator
    //Wwe can read and remove element while traversing element in the collections.
    //It can be used with any class of the collection framework.
    //Any changes in the collection, such as removing element from the collection during a thread is iterating collection then it throw concurrent modification exception.

    //It has following methods
    //hasNext()
    //next()
    //remove()


    //Enumeration
    //Using Enumeration, we can only read element during traversing element in the collections.
    //It can be used only with legacy class of the collection framework such as a Vector and HashTable.
    //Enumeration is Fail safe in nature. It doesn't throw concurrent modification exception

    //It has following methods
    //hasMoreElements()
    //nextElement()

}
