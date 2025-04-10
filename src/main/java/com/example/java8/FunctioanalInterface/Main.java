package com.example.java8.FunctioanalInterface;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

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
