package com.example.streamApi.spring.differentInjection.resourceAutowiredInjectAnnotationInjection.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        //@Resource annotation@ chi karox kaxvacutyun nerarkel constructori mijocov
        ApplicationContext context = new AnnotationConfigApplicationContext(Person.class, Service.class);
        Service service = context.getBean(Service.class);
        service.getPerson().print();

    }
}
