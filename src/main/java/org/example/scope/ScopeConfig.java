package org.example.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeConfig {
    @Bean
    @Scope("singleton")
    public User user01(){
        return new User("单例");
    }

    @Bean
    @Scope("prototype")
    public User user02(){
        return new User("多实例");
    }
}
