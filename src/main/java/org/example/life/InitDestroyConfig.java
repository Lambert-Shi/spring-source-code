package org.example.life;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class InitDestroyConfig {
    @Scope(scopeName = "singleton")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public User user01(){
        return new User("单实例Bean");
    }

    @Scope(scopeName = "prototype")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public User user02(){
        return new User("多实例Bean");
    }
}
