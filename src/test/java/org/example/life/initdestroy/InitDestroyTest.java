package org.example.life.initdestroy;

import org.example.life.InitDestroyConfig;
import org.example.life.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InitDestroyTest {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(InitDestroyConfig.class);
        String[] beanNamesForType = applicationContext.getBeanNamesForType(User.class);
        for (String name : beanNamesForType) {
            System.out.println("beanName:" + name + "===bean:" + applicationContext.getBean(name));
        }
        applicationContext.close();
    }
}
