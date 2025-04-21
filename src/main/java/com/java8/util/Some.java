package com.java8.util;

public class Some {
    public static void main(String[] args) {
        try {
            Class.forName("dsfsfs");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
            throw new RuntimeException(e);
        }
    }


    public static void songAnything() {
        System.out.println("some music...");
    }

    public void songSomething() {
        System.out.println("some music...it's not static method");
    }

}
