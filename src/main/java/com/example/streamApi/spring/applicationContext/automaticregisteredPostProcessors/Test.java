package com.example.streamApi.spring.applicationContext.automaticregisteredPostProcessors;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
    public static void main(String[] args) {
        //  test CostumerBeanFactoryPostProcessor and CostumerBeanPostProcessor

      // ApplicationContext @ avtomat registraciae anum BeanFactoryPostProcessor@ ev BeanPostProcessor@

        ClassPathResource classPathResource = new ClassPathResource("processors.xml");
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(classPathResource);

        CostumerBeanFactoryPostProcessor costumerBeanFactoryPostProcessor
                = (CostumerBeanFactoryPostProcessor) xmlBeanFactory.getBean("costumerBeanFactoryPostProcessor");
        CostumerBeanPostProcessor costumerBeanPostProcessor
                = (CostumerBeanPostProcessor) xmlBeanFactory.getBean("costumerBeanPostProcessor");

        System.out.println(costumerBeanFactoryPostProcessor.isBeanFactoryPostProcessorRegistered());
        System.out.println(costumerBeanPostProcessor.isBeanFactoryPostProcessorRegistered());

        System.out.println("application contextov beaner@ avtomaten registracia arvum");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("processors.xml");

        CostumerBeanFactoryPostProcessor costumerBeanFactoryPostProcessor1
                = (CostumerBeanFactoryPostProcessor) context.getBean("costumerBeanFactoryPostProcessor");
        CostumerBeanPostProcessor costumerBeanPostProcessor1
                = (CostumerBeanPostProcessor) context.getBean("costumerBeanPostProcessor");

        System.out.println(costumerBeanFactoryPostProcessor1.isBeanFactoryPostProcessorRegistered());
        System.out.println(costumerBeanPostProcessor1.isBeanFactoryPostProcessorRegistered());
    }
}
