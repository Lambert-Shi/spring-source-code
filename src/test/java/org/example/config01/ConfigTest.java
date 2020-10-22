package org.example.config01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigTest {
    @Test
    public void xml(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/config01/beans.xml");
        String[] beanNamesForType = applicationContext.getBeanNamesForType(User.class);
        for (String name : beanNamesForType) {
            System.out.println(name);
            System.out.println(applicationContext.getBean(name));
        }
    }

    @Test
    public void annotation(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        String[] beanNamesForType = applicationContext.getBeanNamesForType(User.class);
        for (String name : beanNamesForType) {
            System.out.println(name);
            System.out.println(applicationContext.getBean(name));
        }
    }
}
