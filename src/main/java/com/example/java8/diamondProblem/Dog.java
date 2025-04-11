package com.example.java8.diamondProblem;

public class Dog implements A, B {

    @Override
    public void some() {
        B.super.some();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.some();
        A.stat();
    }

}
