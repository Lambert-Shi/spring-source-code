package org.example.listener;

import org.example.listener.case02.ListenerConfig;
import org.example.listener.case02.MyApplicationEvent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= ListenerConfig.class)
public class ApplicationEvent02 {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test01(){
        MyApplicationEvent myApplicationEvent = new MyApplicationEvent("炸了你");
        applicationContext.publishEvent(myApplicationEvent);
    }
}