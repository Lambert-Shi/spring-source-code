package org.example.config01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(value = "user01")
    public User user(){
        return new User("编码方式注入的Bean");
    }
}
