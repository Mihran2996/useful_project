package com.example.collection.vs.araylistVSlinkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    //https://www.geeksforgeeks.org/linked-list-vs-array/?ref=gcse

    //                             ARRAYLIST VS LINKED LIST

    //ArrayList internally uses a dynamic array to store the elements.
    //Generally, when an ArrayList is initialized, a default capacity of 10 is assigned to the ArrayList.
    //Arrays are stored in contiguous location fixed size
    //Memory is allocated in compile time
    //Uses less memory than linked list
    //Elements can be accessed easily
    //Insertion and deletion operations take times


    //Linked list implements Dequeue it allows it to access element since end
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        System.out.println(queue.peek());
    }
    //LinkedList internally uses a doubly linked list to store the elements.
    //Linked lists are not stored in contiguous location
    //Memory is allocated in runtime
    //Uses more memory because it stores address  to the next node
    //Element accessing requires only traversal of whole linked list
    //Insertion and deletion operation is fast
}
