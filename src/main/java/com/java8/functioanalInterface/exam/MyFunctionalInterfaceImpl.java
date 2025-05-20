package com.java8.functioanalInterface.exam;

public class MyFunctionalInterfaceImpl{

    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = (msg) -> System.out.printf("msg: %s\n", msg);
        myFunctionalInterface.doSomethingElse("hello");
    }
}
