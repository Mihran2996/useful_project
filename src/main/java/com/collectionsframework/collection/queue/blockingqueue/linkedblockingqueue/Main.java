package com.collectionsframework.collection.queue.blockingqueue.linkedblockingqueue;

import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    //https://www.geeksforgeeks.org/linkedblockingqueue-class-in-java/

    //LINKEDBLOCKINGQUEUE

    //This queue orders elements FIFO ` FIRST IN FIRST OUT.

    //******************************************************************************************************************
    //The LinkedBlockingQueue is an optionally-bounded blocking queue based on linked nodes.
    //It means that the LinkedBlockingQueue can be bounded, if its capacity is given, else the LinkedBlockingQueue will be unbounded.
    //The capacity can be given as a parameter to the constructor of LinkedBlockingQueue.
    //This queue orders elements FIFO (first-in-first-out).
    //It means that the head of this queue is the oldest element of the elements present in this queue.
    //The tail of this queue is the newest element of the elements of this queue.
    //The newly inserted elements are always inserted at the tail of the queue,
    //and the queue retrieval operations obtain elements at the head of the queue.
    //Linked queues typically have higher throughput than array-based queues but less predictable performance in most concurrent applications.
    //******************************************************************************************************************

    public static void main(String[] args) {

        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(2);

        queue.add(1);
        queue.add(1);

        System.out.println(queue);

        //When size is equal to capacity the queue is blocked and each method call from blocking queue will throw `
        //Exception in thread "main" java.lang.IllegalStateException: Queue full
        queue.add(5);
        //******************************************************************************************************************

    }

}
