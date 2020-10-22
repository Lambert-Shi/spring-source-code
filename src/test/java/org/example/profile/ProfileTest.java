package org.example.profile;

import org.example.bean.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shiKui
 */
public class ProfileTest {
    /**
     * 使用编码方式设置环境
     */
    @Test
    public void codingSetupEnvironmentTest() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("dev", "test");
        applicationContext.register(ProfileConfig.class);
        applicationContext.refresh();
        String[] beanNamesForType = applicationContext.getBeanNamesForType(User.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }
    /**
     * 配置启动参数设置环境
     */
    @Test
    public void configureStartupParametersTest() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ProfileConfig.class);
        String[] beanNamesForType = applicationContext.getBeanNamesForType(User.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }
}
