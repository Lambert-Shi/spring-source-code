package org.example.scope;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {
    @Test
    public void scopeTest(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);
        User user01_1 = applicationContext.getBean("user01",User.class);
        User user01_2 = applicationContext.getBean("user01",User.class);
        System.out.println(user01_1 == user01_2);
        User user02_1 = applicationContext.getBean("user02",User.class);
        User user02_2 = applicationContext.getBean("user02",User.class);
        System.out.println(user02_1 == user02_2);
    }
}
