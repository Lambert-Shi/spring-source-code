package org.example.componentscan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@ComponentScan(value = "org.example.componentscan",useDefaultFilters = false,lazyInit = true,
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class}))
@Configuration
public class ComponentScanConfig {
    @Bean
    public User user() {
        return new User();
    }
}
