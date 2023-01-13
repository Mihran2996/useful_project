package com.example.streamApi.java8;

public interface Message {
    void getMessage(String message);

    default void defMethod(){
        System.out.println("....It is default method");
    }

    static  void statMethod(){
        System.out.println("...It is static method");
    }
}
