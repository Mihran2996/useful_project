package com.example.java8.diamondProblem;

public interface A {

    default void some(){
        System.out.println("from A interface");
    }

    static void stat(){
        System.out.println("it's a static method");
    }

}
