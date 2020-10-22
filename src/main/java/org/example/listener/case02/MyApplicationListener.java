package org.example.listener.case02;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
    /**
     * 当容器中发布此事件的时候，方法会触发
     * @param event
     */
    public void onApplicationEvent(MyApplicationEvent event) {
        System.out.println("收到的事件:" + event);
    }
}