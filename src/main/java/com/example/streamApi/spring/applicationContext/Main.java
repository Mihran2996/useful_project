package com.example.streamApi.spring.applicationContext;

import com.example.streamApi.spring.beanFactory.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //ApplicationContext@ ashxatume Eager tarberakov
        //minjev getBean kanchel@ sarqume bean@
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
        System.out.println(Employee.isIsBeanInstantiated());

        //minjev context.getBean() kanchel@ application context@ beaner@ arden sarqume
        Employee employee = context.getBean("employee", Employee.class);
    }
}
