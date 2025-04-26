package com.collectionsframework.differenceBetween.comparatorVScomparable;


public class Main {

    //https://medium.com/@ganesh.shah/comparator-vs-comparable-java-8-940a83f53bd3

    //Comparable is used to define the natural ordering of objects within a class.

    //Meaning:
    //The class itself (like Student, Employee, etc.) defines how it should be sorted — once and forever unless you change the class.
    //
    //You must implement Comparable and override compareTo().
    //
    //Example: "Students should always be sorted by age."


    //Comparator is used to define custom ordering for objects, providing flexibility in sorting strategies,
    //especially when you cannot or do not want to modify the original class.
    //Meaning:
    //Sometimes:
    //
    //You can't change the class (maybe it’s from a library).
    //
    //Or you want to sort differently sometimes (age, name, grade, etc.).
    //
    //So you build a separate Comparator class or object with its own compare() logic.
    //
    //Example: "Sort students by name instead of age" → without touching the Student class code.
}
