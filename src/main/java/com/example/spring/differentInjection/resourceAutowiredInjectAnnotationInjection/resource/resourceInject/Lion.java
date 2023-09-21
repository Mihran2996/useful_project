package com.example.spring.differentInjection.resourceAutowiredInjectAnnotationInjection.resource.resourceInject;

public class Lion implements Animal {

    @Override
    public void type() {
        System.out.println("Lion!");
    }

}