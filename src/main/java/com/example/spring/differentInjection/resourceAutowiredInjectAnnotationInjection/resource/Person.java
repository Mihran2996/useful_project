package com.example.spring.differentInjection.resourceAutowiredInjectAnnotationInjection.resource;

import org.springframework.stereotype.Component;

@Component
public class Person {

    public void print() {
        System.out.println("Person realization");
    }

}
