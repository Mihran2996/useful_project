package com.collectionsframework.differenceBetween.failfastVSfailsafe;

public class Main {

    //https://anmolsehgal.medium.com/fail-fast-and-fail-safe-iterations-in-java-collections-11ce8ca4180e#:~:text=The%20iterators%20can%20be%20either,modified%20while%20iterating%20over%20it.
    //What is the difference between fail-fast and fail-safe?

    //modCount field in a collection is changing when removed, add, sett some element in collection
    //when is creating Iterator there is expectedModCount which is initialized getting value of original modCount
    //each iterator.nect() method calling that two variables are compared
    //if there is mismatching so is throwing ConcurrentModificationException


    //Fail-Fast: ArrayList -> Iterator
    //Modification collection like remove, add, sett and so on when Iterator travers over a collection will throw ConcurrentModificationException

    //Fail-Safe: CopyOnWriteArrayList -> COWIterator implements ListIterator
    //This iterator copy original array amd each time to equal expectedModCount witch copied modeCount which will not be changed if array will be changed.

}
