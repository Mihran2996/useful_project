package com.example.streamApi.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ForTest {
    @Autowired
    Some some;

    public void print() {
        System.out.println("Hello");
    }


    public String callPrint() {
        print();
        return "print hello is called";
    }

    public int useSomeObj() {
        some.say();
        return 5;
    }

    public String say2() {
        return some.say2();
    }
}
