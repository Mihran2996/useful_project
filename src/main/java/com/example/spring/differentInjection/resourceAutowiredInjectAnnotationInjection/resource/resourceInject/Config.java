package com.example.spring.differentInjection.resourceAutowiredInjectAnnotationInjection.resource.resourceInject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.streamApi.spring.differentInjection.resourceAutowiredInjectAnnotationInjection.resourceInject")
public class Config {

    @Bean
    public AnimalKeeper animalKeeper() {
        return new AnimalKeeper();
    }

    @Bean
    public Lion lion() {
        return new Lion();
    }

    @Bean
    public Tiger tiger() {
        return new Tiger();
    }
}
