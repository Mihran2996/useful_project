package com.example.streamApi.spring.differentInjection.resourceAutowiredInjectAnnotationInjection.resource.resourceInject;

public class Lion implements Animal {

    @Override
    public void type() {
        System.out.println("Lion!");
    }

}