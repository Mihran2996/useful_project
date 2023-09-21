package com.example.spring.differentInjection.resourceAutowiredInjectAnnotationInjection.resource.resourceInject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AnimalKeeper animalKeeper = context.getBean(AnimalKeeper.class);
        animalKeeper.getTiger().type();
        context.close();
    }
}
