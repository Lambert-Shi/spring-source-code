package org.example.imports;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RegisterConfig {
    @Bean
    public Dog dog01(){
        return new Dog("haha");
    }
}
