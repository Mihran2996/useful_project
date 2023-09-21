package com.example.collection.list.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //https://www.geeksforgeeks.org/stack-class-in-java/?ref=gcse

        //Big O

        //If Stack use as LinkedList
        //***************************************************
        //push(33) - If there are free space the complexity will be = Big O(1)
        //***************************************************
        //push(44) - If  aren't free space and hence complexity hence will be =  Big O(n)
        //needs to create new array, copy elements of old array into new array.
        //***************************************************
        //peek() - will be O(1) because under it is called method of vector and vector has directly access to element
        //***************************************************
        //pop() - will be O(1), because it removes from end.
        //***************************************************
        //**************************************************************************************************************

        //Stack class implements the Vector and works as LIFO ` LAST IN FIRST OUT
        //It has only defaulted Stack() constructor
        //**************************************************************************************************************

        Stack<Integer> stack = new Stack<>();

        //empty() - return boolean value
        System.out.println(stack.empty());
        //*********************************************4

        //*********************************************4
        //push(Object o) - the method adds element and return added element
        //under push(Object o) method is called addElement(E obj) of Vector class.
        Integer push = stack.push(5);
        System.out.println(push);

        stack.push(6);
        stack.push(7);
        System.out.println(stack);
        //*********************************************

        //*********************************************
        //pop() - the method returns element from end and removes element from stack
        //under pop(Object o) method is called removeElementAt(int index)  of Vector class.
        System.out.println(stack.pop());
        //*********************************************

        //*********************************************
        //peek() - the method returns element from end but does not remove the element from stack
        //under peek() method is called elementAt(int index) of Vector class.
        System.out.println(stack.peek());
        //*********************************************

        //*********************************************
        //search(Object o) - the method returns corresponding index of object otherwise if there is not an object` -1
        System.out.println(stack.search(6));
        //**************************************************************************************************************
    }
}
