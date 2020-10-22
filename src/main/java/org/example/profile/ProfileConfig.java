package org.example.profile;

import org.example.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author shiKui
 */
@Profile("test")
@Configuration
public class ProfileConfig {
    @Profile("default")
    @Bean
    public User defaultUser(){
        return new User("default");
    }

    @Profile("dev")
    @Bean
    public User devUser(){ return new User("default"); }

    @Profile("test")
    @Bean
    public User testUser(){
        return new User("test");
    }

    @Profile("prod")
    @Bean
    public User prodUser(){ return new User("prod"); }
}
