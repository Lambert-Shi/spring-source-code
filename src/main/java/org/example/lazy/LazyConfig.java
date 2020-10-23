package org.example.lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class LazyConfig {
    @Lazy
    @Bean
    public User user(){
        return new User();
    }
}
