package org.example.importselector;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportSelectorTest {
    @Test
    public void importSelectorTest(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportSelectorConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            System.out.println("beanName:" + beanName + "===" + "bean对象:" + applicationContext.getBean(beanName));
        }
    }
}
