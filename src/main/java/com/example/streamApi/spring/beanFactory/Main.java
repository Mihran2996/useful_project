package com.example.streamApi.spring.beanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {

        //bean was created of BeanFactory
        //beanfactoryn ashxatume LAZY,chi sarqum bean@ minjev ches kanchum context.getbean()

        ClassPathResource classPathResource = new ClassPathResource("employee.xml");
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(classPathResource);

        //false ktpi vorovhetev bean@ chi sarqel
        System.out.println(Employee.isIsBeanInstantiated());
        Employee employee1 = (Employee) xmlBeanFactory.getBean("employee");

        //es pahin kkancvi postConstruct() method@ qani vor ayn bean@ stexcveluc araje kanchvum
        //ktpi true vorovhetev bean@ sarqele
        System.out.println(employee1.isIsBeanInstantiated());
    }
}
