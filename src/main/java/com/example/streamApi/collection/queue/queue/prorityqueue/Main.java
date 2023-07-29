package com.example.streamApi.collection.queue.queue.prorityqueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    //https://www.geeksforgeeks.org/priority-queue-class-in-java/?ref=gcse

    //PRIORITYQUEUE

    //                                          BIG O COMPLEXITY IN PRIORITYQUEUE

    //******************************************************************************************************************
    //offer() - will be O(n), because before adding it is sorted by Comparable or Comparator
    //*************************************************
    //poll() - will be O(n), because after poll() it sorts all the elements and moves one index to the left.
    //*************************************************
    //peek() - will be O(1), because after retrieving element it does not remove it.
    //******************************************************************************************************************

    //The default capacity is 11.
    //It gives priority based comparable sorting, or we can create queue given him Comparator in constructor
    //******************************************************************************************************************

    //A PriorityQueue is used when the objects are supposed to be processed based on the priority.
    //It is known that a Queue follows the First-In-First-Out algorithm,
    //but sometimes the elements of the queue are needed to be processed according to the priority,
    //that’s when the PriorityQueue comes into play.

    //The PriorityQueue is based on the priority heap.
    //The elements of the priority queue are ordered according to the natural ordering,
    //or by a Comparator provided at queue construction time, depending on which constructor is used.
    //******************************************************************************************************************

    //A few important points on Priority Queue are as follows:

    //PriorityQueue doesn’t permit null.
    //We can’t create a PriorityQueue of Objects that are non-comparable
    //Since PriorityQueue is not thread-safe,
    //java provides PriorityBlockingQueue class that implements the BlockingQueue interface to use in a java multithreading environment.


    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();

        //**************************************************************************************************************
        //Methods in PriorityQueue class

        //offer(E e) - Inserts the specified element into this priority queue.
        queue.offer("a");
        queue.offer("x");
        queue.offer("c");
        queue.offer("b");

        System.out.println(queue);

        //comparator() - Removes all of the elements from this priority queue.
        Comparator<? super String> comparator = queue.comparator();
        System.out.println(comparator);
        //*****************************************

        //remove(Object o) - Removes a single instance of the specified element from this queue, if it is present.
        //returns boolean value
        System.out.println(queue.remove("x"));
        //**************************************************************************************************************

        //**************************************************************************************************************
        //Methods Declared in interface java.util.Queue

        //peek() - Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        System.out.println(queue.peek());
        //*****************************************
        //poll() - Retrieves and removes the head of this queue, or returns null if this queue is empty.
        //After poll() it sorts all the elements and moves one index to the left
        System.out.println(queue.poll());
        System.out.println(queue);
        //**************************************************************************************************************

        //**************************************************************************************************************
        //Methods Declared in class java.util.AbstractCollection

        //isEmpty() - Returns true if this collection contains no elements.
        System.out.println(queue.isEmpty());
        //*****************************************
        Iterator<String> iterator = queue.iterator();
        Queue<String> clone = new PriorityQueue<>();
        while (iterator.hasNext()) {
            clone.offer(iterator.next());
        }
        //containsAll(Collection<?> c) - Returns true if this collection contains all of the elements in the specified collection.
        System.out.println(queue.containsAll(clone));
        //*****************************************

        //**************************************************************************************************************
        //Methods Declared in class java.util.AbstractQueue

        //element() - Retrieves, but does not remove, the head of this queue.
        System.out.println(queue.element());
        //*****************************************
        //remove() - Retrieves and removes the head of this queue.
        System.out.println(queue.remove());
        //**************************************************************************************************************

    }
}
