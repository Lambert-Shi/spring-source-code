package org.example.importbeandefinitionregistrar;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportBeanDefinitionRegistrarTest {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyImportBeanDefinitionRegistrarConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println("beanName:" + beanName + "===" + "bean对象:" + applicationContext.getBean(beanName));
        }
    }
}
