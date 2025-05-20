package com.example.collection;

import java.util.*;

public class Ex {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(13);

//        System.out.print( list.get(list.size() - 1));

        SortedSet<String> set = new TreeSet<String>();
        set.add("d");
        set.add("c");
        set.add("b");
        set.add("a");

        for (String s : set) {
            System.out.print(s);
        }
        Deque<Number> deq = new LinkedList<>();

        List<Number> ls =new ArrayList<>();

    }
}
