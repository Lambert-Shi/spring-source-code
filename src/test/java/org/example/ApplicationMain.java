package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class ApplicationMain {
    public static void main(String[] args) {
        // 创建 ApplicationContext 实例
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Resource res = ctx.getResource("beans.xml");
        // 获取该资源的简单信息
        System.out.println(res.getFilename());
        System.out.println(res.getDescription());
    }
}
