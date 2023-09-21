package com.example.spring.applicationContext.circularDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    String name = "Poxos";
    private A a;

    @Autowired
    public B(A a) {
        this.a = a;
    }


    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                '}';
    }

        public A getA() {
        return a;
    }
}
