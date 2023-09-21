package com.example.spring.applicationContext.automaticregisteredPostProcessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;


public class CostumerBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    private  boolean isBeanFactoryPostProcessorRegistered = false;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        isBeanFactoryPostProcessorRegistered = true;
    }

    public CostumerBeanFactoryPostProcessor() {
    }

    public boolean isBeanFactoryPostProcessorRegistered() {
        return isBeanFactoryPostProcessorRegistered;
    }
}
