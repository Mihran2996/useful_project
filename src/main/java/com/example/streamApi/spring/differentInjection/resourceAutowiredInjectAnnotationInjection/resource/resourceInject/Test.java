package com.example.streamApi.spring.differentInjection.resourceAutowiredInjectAnnotationInjection.resource.resourceInject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AnimalKeeper animalKeeper = context.getBean(AnimalKeeper.class);
        animalKeeper.getAnimal().type();
        context.close();
    }
}
