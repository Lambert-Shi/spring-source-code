package org.example.componentscan;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanTest {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println("beanName:" + beanName + "===" + "bean对象:" + applicationContext.getBean(beanName));
        }
    }


    @Test
    public void componentScanCustomTest(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanCustomConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println("beanName:" + beanName + "===" + "bean对象:" + applicationContext.getBean(beanName));
        }
    }
}
