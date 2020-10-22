package org.example.factorybean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {
    @Bean
    public UserFactoryBean userFactoryBean(){
        return new UserFactoryBean();
    }
}
