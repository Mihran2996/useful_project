package com.example.streamApi.spring.differentInjection.resourceAutowiredInjectAnnotationInjection.resource.resourceInject;

public class Tiger implements Animal {

    @Override
    public void type() {
        System.out.println("Tiger!");
    }

}