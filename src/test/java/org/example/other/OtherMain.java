package org.example.other;

import org.example.config.ExtConfig;
import org.example.config.MyApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//自动创建Spring应用上下文
@RunWith(SpringJUnit4ClassRunner.class)
//指定加载上下文配置的类
@ContextConfiguration(classes= ExtConfig.class)
public class OtherMain {
    @Autowired
    private MyApplicationContext myApplicationContext;

    @Test
    public void test02(){
    }

    @Test
    public void applicationListenerTest(){
        ApplicationContext applicationContext = myApplicationContext.getApplicationContext();
        applicationContext.publishEvent(new ApplicationEvent(new String("老子发布事件了")) {
        });
    }


}
