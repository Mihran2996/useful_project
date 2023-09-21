package com.example.daemondproblem;

public interface A {
    default void some(){
        System.out.println("A's method");
    }
}
