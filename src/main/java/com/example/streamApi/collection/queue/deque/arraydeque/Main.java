package com.example.streamApi.collection.queue.deque.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    //https://www.geeksforgeeks.org/arraydeque-in-java/?ref=gcse

    //ARRAYDEQUE

    //                                          BIG O COMPLEXITY IN ARRAYLIST

    //******************************************************************************************************************
    //offer() - will be 1(n), because internally it will call offerLast(E e) which adds element since last
    //*************************************************
    //poll() - will be O(n), because after poll() it moves elements to the right of removed index the left.
    //*************************************************
    //peek() - will be O(1), internally is called peekFirst() method, after retrieving element it does not remove it.
    //******************************************************************************************************************


    //ARRAYDEQUE class  works as FIFO ` FIRST IN FIRST OUT


    //The ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the Deque interface.
    //It is also known as Array Double Ended Queue or Array Deck.
    //This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue.

    //The ArrayDeque class in Java is an implementation of the Deque interface that uses a resizable array to store its elements.
    //This class provides a more efficient alternative to the traditional Stack class,
    //which was previously used for double-ended operations.
    //The ArrayDeque class provides constant-time performance for inserting and removing elements from both ends of the queue,
    //making it a good choice for scenarios where you need to perform many add and remove operations.
    //******************************************************************************************************************


    //ADVANTAGES OF USING ARRAYDEQUE:

    //EFFICIENT:
    //The ArrayDeque class provides constant-time performance for inserting and removing elements from both ends of the queue,
    //making it a good choice for scenarios where you need to perform many add and remove operations.

    //RESIZABLE:
    //The ArrayDeque class uses a resizable array to store its elements,
    //which means that it can grow and shrink dynamically to accommodate the number of elements in the queue.

    //THREAD-SAFE:
    //The ArrayDeque class is not thread-safe,
    //but you can use the Collections.synchronizedDeque method to create a thread-safe version of the ArrayDeque class.

    //******************************************************************************************************************

    //DISADVANTAGES OF USING ARRAYDEQUE:

    //NOT sySYNCHRONIZED:
    //By default, the ArrayDeque class is not synchronized,
    //which means that multiple threads can access it simultaneously, leading to potential data corruption.

    //LIMITED CAPACITY:
    //Although the ArrayDeque class uses a resizable array to store its elements,it still has a limited capacity,
    //which means that you may need to create a new ArrayDeque when the old one reaches its maximum size.

    //Null elements are prohibited in the ArrayDeque.

    //******************************************************************************************************************


    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();

        //offer(E e) - Inserts the specified element into this priority queue.
        queue.offer(1);
        queue.offer(5);
        queue.offer(8);
        queue.offer(6);
        System.out.println(queue);
        //******************************************************************************************************************

        //peek() - Retrieves, but does not remove, the first element of this queue, or returns null if this queue is empty.
        System.out.println(queue.peek());
        //******************************************************************************************************************

        //poll() - Retrieves and removes the first element of this queue, or returns null if this queue is empty.
        //After poll() it sorts all the elements and moves one index to the left
        System.out.println(queue.poll());
        //******************************************************************************************************************

    }
}
