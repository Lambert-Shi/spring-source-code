package org.example.importbeandefinitionregistrar;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(MyImportBeanDefinitionRegistrar.class)
@Configuration
public class MyImportBeanDefinitionRegistrarConfig {
}
