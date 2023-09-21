package com.example.collection.vs.listVSset;

public class Main {

    //https://www.javatpoint.com/list-vs-set-in-java

    //LIST INTERFACE
    //The java.util package provides the List interface for maintaining the ordered collection.
    //A List can contain the null and duplicate values. The methods of the List are based on the index,
    //so all the operations like insert, delete, update, and search is based on the index.
    //ArrayList, LinkedList, Stack, and Vector are the implementation classes available in the List interface.
    //In Java, we mostly used the ArrayList and LinkedList implementation classes to design a list.


    //******************************************************************************************************************

    //SET INTERFACE
    //The Set interface belongs to the java.util package that extends the Collection interface.
    //It stores the value in a sorted way, so it doesn't maintain the insertion order.
    //The set interface is used to design the mathematical Set in Java.

    //******************************************************************************************************************


    //                                                 VS

    //LIST
    //The list implementation allows us to add the same or duplicate elements.
    //We can get the element of a specified index from the list using the get() method.
    //It is used when we want to frequently access the elements by using the index.
    //The list implementation classes are ArrayList, LinkedList, Vector, Stack - which implements Vector.

    //SET
    //The set implementation doesn't allow us to add the same or duplicate elements.
    //The Set implementation classes are HashSet, LinkedHashSet, TreeSet - which implements SortedSet interface
    //We cannot find the element from the Set based on the index because it doesn't provide any get method().
    //It is used when we want to design a collection of distinct elements.

    //******************************************************************************************************************

}
