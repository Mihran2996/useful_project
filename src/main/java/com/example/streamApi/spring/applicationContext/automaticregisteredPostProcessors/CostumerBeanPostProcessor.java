package com.example.streamApi.spring.applicationContext.automaticregisteredPostProcessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CostumerBeanPostProcessor implements BeanPostProcessor {
    private boolean isBeanFactoryPostProcessorRegistered = false;



    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        isBeanFactoryPostProcessorRegistered = true;
        return bean;
    }

    public CostumerBeanPostProcessor() {
    }

    public boolean isBeanFactoryPostProcessorRegistered() {
        return isBeanFactoryPostProcessorRegistered;
    }
}
