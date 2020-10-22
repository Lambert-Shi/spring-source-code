package org.example.factorybean;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanTest {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        Object userFactoryBean = applicationContext.getBean("userFactoryBean");
        System.out.println(userFactoryBean);
        Object bean = applicationContext.getBean("&userFactoryBean", UserFactoryBean.class);
        System.out.println(bean);
    }
}
