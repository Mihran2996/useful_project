package com.example.streamApi.java8.diamondProblem;

public interface B {

    default void some(){
        System.out.println("from B interface");
    }
}
