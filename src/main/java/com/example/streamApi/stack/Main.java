package com.example.streamApi.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //stack@ extende anum Vektor-ic, ev ashxatume LIFO tarberakov  Last In First Out
        //stacki mej element avelacneluc inq@ element@ avelacnume misht skzbic
        Stack<Integer> stack = new Stack<>();

        //veradardznume boolean
        System.out.println(stack.empty());

        //push(Object o) method@ avelacnume element ev veradardznume nuyn element@
        Integer push = stack.push(5);
        System.out.println(push);

        stack.push(6);
        stack.push(7);
        //pop() method@ veradardznume stacki skzbic ev jnjume tvyal element@ stacki mejic
        System.out.println(stack.pop());

        //peek() methodnele veradardznum elemnt@ bayc chi jnjum element@ stacki mejic
        System.out.println(stack.peek());

        //serach(Object o) method@ veradardznume tvyal elementi index@ ete index@ chka kveradardzni -1
        System.out.println(stack.search(6));
    }
}
