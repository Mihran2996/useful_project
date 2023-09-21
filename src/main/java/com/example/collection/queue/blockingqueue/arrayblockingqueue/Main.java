package com.example.collection.queue.blockingqueue.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    //https://www.geeksforgeeks.org/arrayblockingqueue-class-in-java/

    //ARRAYBLOCKINGQUEUE

    //This queue orders elements FIFO ` FIRST IN FIRST OUT.

    //******************************************************************************************************************
    //ArrayBlockingQueue class is a bounded blocking queue backed by an array.
    //By bounded, it means that the size of the Queue is fixed. Once created, the capacity cannot be changed.
    //Attempts to put an element into a full queue will result in the operation blocking.
    //We will get Exception in thread "main" java.lang.IllegalStateException: Queue full
    //Similarly attempts to take an element from an empty queue will also be blocked.
    //Boundness of the ArrayBlockingQueue can be achieved initially bypassing capacity as the parameter in the constructor of ArrayBlockingQueue.
    //This queue orders elements FIFO (first-in-first-out).
    //It means that the head of this queue is the oldest element of the elements present in this queue.

    //The tail of this queue is the newest element of the elements of this queue.
    //The newly inserted elements are always inserted at the tail of the queue,
    //and the queue retrieval operations obtain elements at the head of the queue.
    //******************************************************************************************************************


    public static void main(String[] args) {

        int capacity = 5;

        BlockingQueue<Integer> queue = new ArrayBlockingQueue(capacity);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        //When size is equal to capacity the queue is blocked and each method call from blocking queue will throw `
        //Exception in thread "main" java.lang.IllegalStateException: Queue full

//       queue.add(6);
        System.out.println(queue);
        //**************************************************************************************************************

        //if queue is blocked after this method call we will see :   IllegalStateException: Queue full
        //otherwise it will return the HEAD element (from start)

        System.out.println(queue.peek());
        //**************************************************************************************************************


    }
}
