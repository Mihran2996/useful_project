package com.example.collection.queue.blockingqueue;

public class Main {

    //https://www.geeksforgeeks.org/blockingqueue-interface-in-java/?ref=gcse

    //BLOCKINGQUEUE INTERFACE

    //BLOCKINGQUEUE works as FIFO ` FIRST IN FIRST OUT

    //******************************************************************************************************************
    //The BlockingQueue interface in Java is added in Java 1.5 along with various other concurrent Utility classes
    //like ConcurrentHashMap, Counting Semaphore, CopyOnWriteArrrayList, etc.
    //BlockingQueue interface supports flow control (in addition to queue)
    //by introducing blocking if either BlockingQueue is full or empty.
    //A thread trying to enqueue an element in a full queue is blocked until some other thread makes space in the queue,
    //either by dequeuing one or more elements or clearing the queue completely.
    //Similarly, it blocks a thread trying to delete from an empty queue until some other threads insert an item.
    //BlockingQueue does not accept a null value. If we try to enqueue the null item, then it throws NullPointerException.

    //Java provides several BlockingQueue implementations such as `
    //LinkedBlockingQueue, ArrayBlockingQueue, PriorityBlockingQueue, SynchronousQueue, etc.
    //Java BlockingQueue interface implementations are thread-safe.
    //All methods of BlockingQueue are atomic in nature and use internal locks or other forms of concurrency control.
    //Java 5 comes with BlockingQueue implementations in the java.util.concurrent package.
    //******************************************************************************************************************

    //LinkedBlockingQueue and ArrayBlockingQueue are implement the BlockingQueue interface

    //******************************************************************************************************************
}
