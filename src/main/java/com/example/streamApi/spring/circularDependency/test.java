package com.example.streamApi.spring.circularDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
    public static void main(String[] args) {
        //Sa kqci BeanCurrentlyInCreationException

        ApplicationContext context = new AnnotationConfigApplicationContext(A.class, B.class);
        A bean = context.getBean(A.class);
        System.out.println(bean.getB());


    }
}
