package com.collectionsframework.differenceBetween.iteratorVSlistiterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main {

    //https://medium.com/@vino7tech/iterator-vs-listiterator-in-java-9d49a9f69370

    //What is the difference between Iterator and ListIterator?

    //Iterator
    //Definition: Iterator is a standard interface that allows you to iterate over a collection (like Set, List, or Map) in a sequential manner.

    //Methods:
    //boolean hasNext(): Returns true if there are more elements to iterate over.
    //E next(): Returns the next element in the iteration.
    //void remove(): Removes the last element returned by the iterator from the underlying collection.

    //Usage: It can be used with any class that implements the Collection interface, such as ArrayList, HashSet, etc.


    //ListIterator
    //Definition: ListIterator is a subinterface of Iterator that is specific to the List interface. It allows bidirectional iteration over a list.

    //Methods:
    //All methods from Iterator.
    //boolean hasPrevious(): Returns true if there are elements before the current position.
    //E previous(): Returns the previous element in the iteration.
    //int nextIndex(): Returns the index of the element that would be returned by a subsequent call to next().
    //int previousIndex(): Returns the index of the element that would be returned by a subsequent call to previous().
    //void set(E e): Replaces the last element returned by next() or previous() with the specified element.
    //void add(E e): Inserts the specified element into the list at the current position.

    //Usage: It can only be used with classes that implement the List interface, such as ArrayList, LinkedList, etc.

    //Key Differences
    //Direction: Iterator allows forward traversal only, while ListIterator allows both forward and backward traversal.
    //Collection Type: Iterator can be used with any collection type, whereas ListIterator is specifically for lists.
}
