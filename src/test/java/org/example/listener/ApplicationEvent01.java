package org.example.listener;

import org.example.listener.case01.ListenerConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//指定加载上下文配置的类
@ContextConfiguration(classes= ListenerConfig.class)
public class ApplicationEvent01 {
    /**
     * public abstract class ApplicationEvent extends EventObject
     * 监听目标
     * public interface ApplicationListener<E extends ApplicationEvent> extends EventListener
     * 监听者
     * 监听ApplicationEvent的子类
     * 当容器中发布此事件的时候，ApplicationListener.onApplicationEvent()会得到触发
     *
     * 开发步骤：
     * 1、实现ApplicationEvent，创建一个监听目标
     * 2、实现ApplicationListener，创建一个监听者
     * 3、只要容器中发布此事件，则触发ApplicationListener.onApplicationEvent()
     */
    @Test
    public void test01(){

    }
}
