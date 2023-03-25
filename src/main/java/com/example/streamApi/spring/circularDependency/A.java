package com.example.streamApi.spring.circularDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    private B b;


    @Autowired
    public A(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public B getB() {
        return b;
    }
}
