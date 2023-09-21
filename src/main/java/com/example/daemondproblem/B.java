package com.example.daemondproblem;

public interface B {

    default void some() {
        System.out.println("B's method");
    }
}
