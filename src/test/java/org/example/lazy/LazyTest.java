package org.example.lazy;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LazyTest {
    @Test
    public void test01() throws InterruptedException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LazyConfig.class);
        System.out.println("初始化容器完成");
        Thread.sleep(1*1000);
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }
}
