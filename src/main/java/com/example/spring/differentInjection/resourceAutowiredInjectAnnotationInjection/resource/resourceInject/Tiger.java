package com.example.spring.differentInjection.resourceAutowiredInjectAnnotationInjection.resource.resourceInject;

public class Tiger implements Animal {

    @Override
    public void type() {
        System.out.println("Tiger!");
    }

}