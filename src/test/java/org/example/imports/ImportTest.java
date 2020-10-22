package org.example.imports;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {
    @Test
    public void imports(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println("beanName:" + beanName + "===" + "bean对象:" + applicationContext.getBean(beanName));
        }
    }
}
