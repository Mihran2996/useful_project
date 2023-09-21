package com.example.java8.FunctioanalInterface;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {


        //functional interface example
        //apahovume aveli karch syntax
        Runnable runnable = () -> System.out.println("thread staretd");
        runnable.run();




        //ays paragayum syntax@ aveli erkare,ev stexcvume anonymous class
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread started");
            }
        };
        runnable1.run();

        //Predicate functional  intyerfacen verdarznume tramabanakan arjeq
        Predicate<Integer> predicate = t-> t==0;
        System.out.println(predicate.test(10));


    }
}
