package org.example.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().getSystemProperties().put("businessLicense",true);
        applicationContext.register(HotelConditionConfig.class);
        applicationContext.refresh();
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Hotel.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }
}
