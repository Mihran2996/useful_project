package com.example.streamApi.daemondproblem;

public interface B {

    default void some() {
        System.out.println("B's method");
    }
}
