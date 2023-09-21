package com.example.comparatorAndComparable.ComparableExample;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Comparable uni mek compareTo(Object o)method@
        //ayn sortavorume katarum himnvelov mek objecti vra


        Set<User> set = new TreeSet<>();
        set.add(new User(5, "poxos", "poxosyan"));
        set.add(new User(2, "poxos2", "poxosyan2"));

        Iterator<User> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
