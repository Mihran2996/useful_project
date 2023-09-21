package com.example.spring.cglbDynamicProxies.cglb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;

@Configuration
public class Config {

    @Bean
    public static Tool getTool() {
        return new Tool("Hummer");
    }

    @Bean
    public Worker getFirstWorker() {
        return new Worker(getTool());
    }

    @Bean
    @Scope("prototype")
    public Prot getPrototype() {
        return new Prot();
    }

    @PostConstruct
    public void init() {
        System.out.println("------------------------------------Tool-i depqum ktesnenq tarber hascener qani vor statice method@ ev proxy chi ashxatum");
        System.out.println("====================================" + getTool());
        System.out.println("====================================" + getTool());
        System.out.println("------------------------------------Worker-i depqum ktesnenq nuyn hascener@ qani vor proxyn ksteci singleton beaner");
        System.out.println("====================================" + getFirstWorker());
        System.out.println("====================================" + getFirstWorker());
        System.out.println("------------------------------------Pro-i depqum ktesnenq tarber hascener qani vor bean-i scop@ prototype");
        System.out.println("====================================" + getPrototype());
        System.out.println("====================================" + getPrototype());
    }
}
