package org.example.listener.case01;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
    /**
     * 当容器中发布此事件的时候，方法会触发
     *
     * @param event
     */
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("收到的事件:" + event);
    }
}
