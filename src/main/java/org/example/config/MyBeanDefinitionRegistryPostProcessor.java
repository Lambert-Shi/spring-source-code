package org.example.config;

import org.example.bean.Book;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor...postProcessBeanDefinitionRegistry...bean的数量:" + registry.getBeanDefinitionCount());
        RootBeanDefinition beanDefinition = new RootBeanDefinition(Book.class);
        registry.registerBeanDefinition("hello",beanDefinition);
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor...postProcessBeanFactory...bean的数量:" + beanFactory.getBeanDefinitionCount());
    }
}
