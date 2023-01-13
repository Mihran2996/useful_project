package com.example.streamApi.spring.differentInjection.resourceAutowiredInjectAnnotationInjection.resource;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Service {

    @Resource
    private Person person;

    public Person getPerson() {
        return person;
    }
//    @Resource
    public void setPerson(Person person) {
        this.person = person;
    }

//        @Resource
    //@Resource annotacian chi karox kaxvacutyun@ nerarki constructori mijocov,bayc field-i ev setter-i mijocov karoxe
    public Service(Person person) {
        this.person = person;
    }

    public Service() {
    }
}
