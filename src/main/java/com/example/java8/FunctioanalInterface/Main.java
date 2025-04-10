package com.example.java8.FunctioanalInterface;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        //@FunctionalInterface annotation
        //When you annotate an interface with this,
        //It will make sure you don't have more than one abstract method at compile time.
        //This is optional , you may ignore as a programmer.
        //If the programmer specifies annotation then interface can contain only one abstract method.
        //If the programmer specifies more than one abstract method,
        //then compiler show error message “Invalid ‘@FunctionalInterface’ annotation”

        //Consumer
        //Consumer is a functional interface that accepts a single input and returns no output.

        //Predicate
        //This Functional Interface is used for conditional check.
        //It represents a boolean-valued-function of an argument. This is mainly used to filter data from a Java Stream.

        //Supplier
        //This Functional Interface is used in all contexts where there is no input but an output is expected.

        //functional interface example
        //Provides more suitable syntax
        Runnable runnable = () -> System.out.println("thread staretd");
        runnable.run();

        //This situation is created anonymous class
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread started");
            }
        };
        runnable1.run();

        //Predicate functional interface returns logical value
        Predicate<Integer> predicate = t-> t==0;
        System.out.println(predicate.test(10));
    }
}
