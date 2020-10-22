package org.example.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(value = "org.example.componentscan",includeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM,classes = MyFilterType.class),useDefaultFilters = false)
public class ComponentScanCustomConfig {

}
