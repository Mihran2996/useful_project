package com.example.streamApi.collection.list.linkedList;

public class Main {

    //https://www.geeksforgeeks.org/insertion-in-linked-list/
    //https://medium.com/@mckenziefiege/arrays-linked-lists-and-big-o-notation-486727b6259b

    //*****************************************************************************************************************************************************

    //A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations.
    //In simple words, a linked list consists of nodes where each node contains a data field and a reference(link) to the next node in the list.

    //*****************************************************************************************************************************************************

    //https://medium.com/@mckenziefiege/arrays-linked-lists-and-big-o-notation-486727b6259b

    //                                         BIG O COMPLEXITY IN LINKED LIST

    //***************************************************
    //get(0) - GET the element from the beginning of the array will be = Big O(1)
    //***************************************************

    //***************************************************
    //get(8) - GET the element from middle of array will be = Big O(n), it has to iterate up to reach the corresponding index
    //**************************************************

    //***************************************************
    //get(15) - GET the element from end array will be = Big O(1), it can get to the element by starting iteration from the end linkedList is implements DeQueue.
    //***************************************************

    //***************************************************
    //add(33) - ADD the element in the beginning of the array will be = Big O(1), because it doesn't need to iterate over the all elements
    //***************************************************

    //***************************************************
    //add(33) - ADD the element at the end of array will be = Big O(n) ======= if we have a TAIL NODE otherwise it will be BIg O(1)
    //***************************************************

    //***************************************************
    //add() - ADD the element in the middle of linkedList will be = Big O(n), because it has to find the corresponding index before adding.
    //***************************************************

    //***************************************************
    //remove(9)  - DELETE the element in the end of array will be Big O(n) ======= if we have a TAIL NODE otherwise it will be BIg O(1)
    //***************************************************

    //***************************************************
    //remove(4)  - DELETE the element in the middle of linkedList will be Big O(n), because it has to find the corresponding index before adding.
    //***************************************************

    //***************************************************
    //remove(0)  - DELETE the element in the start of linkedList will be Big O(1)
    //***************************************************

    //*****************************************************************************************************************************************************


    //https://www.geeksforgeeks.org/data-structures/linked-list/

    //                                  THERE ARE MAINLY THREE TYPE OF LINKED LISTS :

    //1- SINGLE LINKED LIST
    //2- DOUBLE LINKED LIST
    //3- CIRCULAR LINKED LIST

    //***************************************************
    //SINGLE LINKED LIST = In a singly linked list, each node contains a reference to the next node in the sequence.
    //It is used in the MAP when happens coliseum
    //***************************************************

    //***************************************************
    //DOUBLE LINKED LIST = In a doubly linked list, each node contains references to both the next and previous nodes.
    //***************************************************

    //***************************************************
    //CIRCULAR LINKED LIST =  In a circular linked list, the last node points back to the head node, creating a circular structure.
    //***************************************************

    //*****************************************************************************************************************************************************

    //ADVANTAGES OF LINKED LISTS

    //DYNAMIC SIZE = Linked lists can grow or shrink dynamically, as memory allocation is done at runtime.
    //INSERTION AND DELETION =  Adding or removing elements from a linked list is efficient, especially for large lists.
    //FLEXIBILITY = Linked lists can be easily reorganized and modified without requiring a contiguous block of memory.

    //*****************************************************************************************************************************************************

    //DISADVANTAGES OF LINKED LISTS
    //RANDOM ACCESS = Unlike arrays, linked lists do not allow direct access to elements by index.
    //To reach the index, should start iterating from the node

    //*****************************************************************************************************************************************************


}
