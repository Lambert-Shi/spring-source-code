package org.example.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author shiKui
 */
@Configuration
public class HotelConditionConfig {
    @Conditional(value = HotelCondition.class)
    @Bean
    public Hotel hotel(){
        return new Hotel();
    }
}
