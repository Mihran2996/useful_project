package com.collectionsframework.differenceBetween.comparatorVScomparable.comparable;

import com.collectionsframework.differenceBetween.comparatorVScomparable.comparable.model.User;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //https://medium.com/@himani.prasad016/comparable-vs-comparator-7aefb0a697c7

        //The Comparable interface is part of the Java API and is used to define the natural ordering of objects.
        //By implementing the Comparable interface, a class indicates that its instances can be compared to one another.
        //The Comparable interface consists of a single method called compareTo(), which returns an integer value representing the comparison result.

        //The compareTo() method follows a simple convention:
        //
        //It returns a negative integer if the calling object is less than the object being compared.
        //zero if the calling object is equal to the object being compared.
        //positive integer if the calling object is greater than the object being compared.

        //By implementing the Comparable interface, objects can be sorted using the Arrays.sort() or Collections.sort() methods,
        //which internally use the compareTo() method to determine the order.

        Set<User> set = new TreeSet<>();
        set.add(new User(5, "poxos", "poxosyan"));
        set.add(new User(2, "poxos2", "poxosyan2"));

        Iterator<User> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
