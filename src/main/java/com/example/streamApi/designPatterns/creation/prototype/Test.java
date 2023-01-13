package com.example.streamApi.designPatterns.creation.prototype;

import java.util.List;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        prototype.executeData();
        List<Integer> data = prototype.getData();

        Prototype prototype2 = (Prototype) prototype.clone();
        List<Integer> data2 = prototype2.getData();
        data2.add(5);

        Prototype prototype3 = (Prototype) prototype.clone();
        List<Integer> data3 = prototype3.getData();
        data3.remove(0);

        System.out.println(data);
        System.out.println(data2);
        System.out.println(data3);


    }
}
