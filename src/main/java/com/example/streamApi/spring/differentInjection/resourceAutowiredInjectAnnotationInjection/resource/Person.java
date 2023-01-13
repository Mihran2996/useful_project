package com.example.streamApi.spring.differentInjection.resourceAutowiredInjectAnnotationInjection.resource;

import org.springframework.stereotype.Component;

@Component
public class Person {

    public void print() {
        System.out.println("Person realization");
    }

}
